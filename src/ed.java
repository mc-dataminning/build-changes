import com.mojang.serialization.Codec;
import java.util.Optional;

public class ed {
   public static final Codec<ed> a = alg.a.xmap(ed::new, ed::a);
   private final alg b;
   private boolean c;
   private Optional<hw<ei>> d = Optional.empty();

   public ed(alg $$0) {
      this.b = $$0;
   }

   public Optional<hw<ei>> a(alv $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public alg a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof ed $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
