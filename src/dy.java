import com.mojang.serialization.Codec;
import java.util.Optional;

public class dy {
   public static final Codec<dy> a = akh.a.xmap(dy::new, dy::a);
   private final akh b;
   private boolean c;
   private Optional<hp<ed>> d = Optional.empty();

   public dy(akh $$0) {
      this.b = $$0;
   }

   public Optional<hp<ed>> a(akw $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public akh a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof dy $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
