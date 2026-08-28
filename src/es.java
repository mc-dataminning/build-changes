import com.mojang.serialization.Codec;
import java.util.Optional;

public class es {
   public static final Codec<es> a = ald.a.xmap(es::new, es::a);
   private final ald b;
   private boolean c;
   private Optional<im<ex>> d = Optional.empty();

   public es(ald $$0) {
      this.b = $$0;
   }

   public Optional<im<ex>> a(als $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public ald a() {
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
