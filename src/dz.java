import com.mojang.serialization.Codec;
import java.util.Optional;

public class dz {
   public static final Codec<dz> a = akm.a.xmap(dz::new, dz::a);
   private final akm b;
   private boolean c;
   private Optional<hq<ee>> d = Optional.empty();

   public dz(akm $$0) {
      this.b = $$0;
   }

   public Optional<hq<ee>> a(alb $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public akm a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof dz $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
