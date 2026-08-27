import com.mojang.serialization.Codec;
import java.util.Optional;

public class dm {
   public static final Codec<dm> a = ahg.a.xmap(dm::new, dm::a);
   private final ahg b;
   private boolean c;
   private Optional<hb<ds>> d = Optional.empty();

   public dm(ahg $$0) {
      this.b = $$0;
   }

   public Optional<hb<ds>> a(ahu $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public ahg a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof dm $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
