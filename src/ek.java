import com.mojang.serialization.Codec;
import java.util.Optional;

public class ek {
   public static final Codec<ek> a = ale.a.xmap(ek::new, ek::a);
   private final ale b;
   private boolean c;
   private Optional<ib<ep>> d = Optional.empty();

   public ek(ale $$0) {
      this.b = $$0;
   }

   public Optional<ib<ep>> a(alt $$0) {
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
         if ($$0 instanceof ek $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
