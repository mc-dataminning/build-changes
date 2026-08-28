import com.mojang.serialization.Codec;
import java.util.Optional;

public class es {
   public static final Codec<es> a = akv.a.xmap(es::new, es::a);
   private final akv b;
   private boolean c;
   private Optional<il<ex>> d = Optional.empty();

   public es(akv $$0) {
      this.b = $$0;
   }

   public Optional<il<ex>> a(alk $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public akv a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof es $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
