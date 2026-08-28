import com.mojang.serialization.Codec;
import java.util.Optional;

public class ef {
   public static final Codec<ef> a = alk.a.xmap(ef::new, ef::a);
   private final alk b;
   private boolean c;
   private Optional<hy<ek>> d = Optional.empty();

   public ef(alk $$0) {
      this.b = $$0;
   }

   public Optional<hy<ek>> a(alz $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public alk a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof ef $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
