import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eho(agi b) implements ehw {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eho> a = RecordCodecBuilder.create($$0 -> $$0.group(agi.a.fieldOf("name").forGetter(eho::c)).apply($$0, eho::new));

   @Override
   public ehx b() {
      return ehy.q;
   }

   @Override
   public void a(efg $$0) {
      eez<ehw> $$1 = new eez<>(efc.a, this.b);
      if ($$0.a($$1)) {
         $$0.a("Condition " + this.b + " is recursively called");
      } else {
         ehw.super.a($$0);
         $$0.b()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown condition table called " + this.b));
      }
   }

   public boolean a(eex $$0) {
      ehw $$1 = $$0.a().getElement(efc.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         eex.c<?> $$2 = eex.a($$1);
         if ($$0.b($$2)) {
            boolean var4;
            try {
               var4 = $$1.test($$0);
            } finally {
               $$0.c($$2);
            }

            return var4;
         } else {
            c.warn("Detected infinite loop in loot tables");
            return false;
         }
      }
   }

   public static ehw.a a(agi $$0) {
      return () -> new eho($$0);
   }

   public agi c() {
      return this.b;
   }
}
