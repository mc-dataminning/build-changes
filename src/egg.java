import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class egg extends egj {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egg> a = RecordCodecBuilder.create($$0 -> a($$0).and(agi.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, egg::new));
   private final agi c;

   private egg(List<ehw> $$0, agi $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public egl b() {
      return egm.B;
   }

   @Override
   public void a(efg $$0) {
      eez<egk> $$1 = new eez<>(efc.b, this.c);
      if ($$0.a($$1)) {
         $$0.a("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.a("Unknown function table called " + this.c));
      }
   }

   @Override
   protected clj a(clj $$0, eex $$1) {
      egk $$2 = $$1.a().getElement(efc.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         eex.c<?> $$3 = eex.a($$2);
         if ($$1.b($$3)) {
            clj var5;
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

   public static egj.a<?> a(agi $$0) {
      return a($$1 -> new egg($$1, $$0));
   }
}
