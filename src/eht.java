import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eht(agm b) implements eib {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eht> a = RecordCodecBuilder.create($$0 -> $$0.group(agm.a.fieldOf("name").forGetter(eht::c)).apply($$0, eht::new));

   @Override
   public eic b() {
      return eid.q;
   }

   @Override
   public void a(efl $$0) {
      efe<eib> $$1 = new efe<>(efh.a, this.b);
      if ($$0.a($$1)) {
         $$0.a("Condition " + this.b + " is recursively called");
      } else {
         eib.super.a($$0);
         $$0.b()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown condition table called " + this.b));
      }
   }

   public boolean a(efc $$0) {
      eib $$1 = $$0.a().getElement(efh.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         efc.c<?> $$2 = efc.a($$1);
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

   public static eib.a a(agm $$0) {
      return () -> new eht($$0);
   }

   public agm c() {
      return this.b;
   }
}
