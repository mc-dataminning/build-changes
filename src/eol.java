import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eol extends eoo {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eol> a = RecordCodecBuilder.create($$0 -> a($$0).and(ajt.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, eol::new));
   private final ajt c;

   private eol(List<eqc> $$0, ajt $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eoq b() {
      return eor.C;
   }

   @Override
   public void a(enk $$0) {
      end<eop> $$1 = new end<>(eng.b, this.c);
      if ($$0.a($$1)) {
         $$0.b("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.b("Unknown function table called " + this.c));
      }
   }

   @Override
   protected crj a(crj $$0, enb $$1) {
      eop $$2 = $$1.a().getElement(eng.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         enb.c<?> $$3 = enb.a($$2);
         if ($$1.b($$3)) {
            crj var5;
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

   public static eoo.a<?> a(ajt $$0) {
      return a($$1 -> new eol($$1, $$0));
   }
}
