import com.mojang.serialization.Codec;
import java.util.Optional;

public class er {
   public static final Codec<er> a = all.a.xmap(er::new, er::a);
   private final all b;
   private boolean c;
   private Optional<ik<ew>> d = Optional.empty();

   public er(all $$0) {
      this.b = $$0;
   }

   public Optional<ik<ew>> a(ama $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public all a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof er $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
