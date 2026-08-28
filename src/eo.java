import com.mojang.serialization.Codec;
import java.util.Optional;

public class eo {
   public static final Codec<eo> a = alc.a.xmap(eo::new, eo::a);
   private final alc b;
   private boolean c;
   private Optional<ih<et>> d = Optional.empty();

   public eo(alc $$0) {
      this.b = $$0;
   }

   public Optional<ih<et>> a(alr $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public alc a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof eo $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
