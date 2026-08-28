import com.mojang.serialization.Codec;
import java.util.Optional;

public class eo {
   public static final Codec<eo> a = akq.a.xmap(eo::new, eo::a);
   private final akq b;
   private boolean c;
   private Optional<ig<et>> d = Optional.empty();

   public eo(akq $$0) {
      this.b = $$0;
   }

   public Optional<ig<et>> a(alf $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public akq a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof eo $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
