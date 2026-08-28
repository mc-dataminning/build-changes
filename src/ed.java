import com.mojang.serialization.Codec;
import java.util.Optional;

public class ed {
   public static final Codec<ed> a = ale.a.xmap(ed::new, ed::a);
   private final ale b;
   private boolean c;
   private Optional<hw<ei>> d = Optional.empty();

   public ed(ale $$0) {
      this.b = $$0;
   }

   public Optional<hw<ei>> a(alt $$0) {
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
         if ($$0 instanceof ed $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
