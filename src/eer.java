import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eer extends eeu {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eer> a = RecordCodecBuilder.create($$0 -> a($$0).and(afw.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, eer::new));
   private final afw c;

   private eer(List<egh> $$0, afw $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eew b() {
      return eex.B;
   }

   @Override
   public void a(edr $$0) {
      edk<eev> $$1 = new edk<>(edn.b, this.c);
      if ($$0.a($$1)) {
         $$0.a("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.a("Unknown function table called " + this.c));
      }
   }

   @Override
   protected ckj a(ckj $$0, edi $$1) {
      eev $$2 = $$1.a().getElement(edn.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         edi.c<?> $$3 = edi.a($$2);
         if ($$1.b($$3)) {
            ckj var5;
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

   public static eeu.a<?> a(afw $$0) {
      return a($$1 -> new eer($$1, $$0));
   }
}
