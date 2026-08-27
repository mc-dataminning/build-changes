import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ehy extends eib {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ehy> a = RecordCodecBuilder.create($$0 -> a($$0).and(ahd.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, ehy::new));
   private final ahd c;

   private ehy(List<ejo> $$0, ahd $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eid b() {
      return eie.B;
   }

   @Override
   public void a(egy $$0) {
      egr<eic> $$1 = new egr<>(egu.b, this.c);
      if ($$0.a($$1)) {
         $$0.b("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.b("Unknown function table called " + this.c));
      }
   }

   @Override
   protected cmr a(cmr $$0, egp $$1) {
      eic $$2 = $$1.a().getElement(egu.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         egp.c<?> $$3 = egp.a($$2);
         if ($$1.b($$3)) {
            cmr var5;
            try {
               var5 = $$2.apply($$0, $$1);
            } finally {
               $$1.c($$3);
            }

            return var5;
         } else {
            b.warn("Detected infinite loop in loot tables");
            return $$0;
         }
      }
   }

   public static eib.a<?> a(ahd $$0) {
      return a($$1 -> new ehy($$1, $$0));
   }
}
