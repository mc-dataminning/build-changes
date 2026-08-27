import com.mojang.serialization.Codec;
import java.util.Optional;

public class dx {
   public static final Codec<dx> a = akf.a.xmap(dx::new, dx::a);
   private final akf b;
   private boolean c;
   private Optional<ho<ec>> d = Optional.empty();

   public dx(akf $$0) {
      this.b = $$0;
   }

   public Optional<ho<ec>> a(akt $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public akf a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof dx $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
