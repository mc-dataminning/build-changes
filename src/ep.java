import com.mojang.serialization.Codec;
import java.util.Optional;

public class ep {
   public static final Codec<ep> a = ale.a.xmap(ep::new, ep::a);
   private final ale b;
   private boolean c;
   private Optional<ii<eu>> d = Optional.empty();

   public ep(ale $$0) {
      this.b = $$0;
   }

   public Optional<ii<eu>> a(alt $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public ale a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof ep $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
