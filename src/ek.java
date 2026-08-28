import com.mojang.serialization.Codec;
import java.util.Optional;

public class ek {
   public static final Codec<ek> a = alb.a.xmap(ek::new, ek::a);
   private final alb b;
   private boolean c;
   private Optional<ib<ep>> d = Optional.empty();

   public ek(alb $$0) {
      this.b = $$0;
   }

   public Optional<ib<ep>> a(alq $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public alb a() {
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
