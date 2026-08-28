import com.mojang.serialization.Codec;
import java.util.Optional;

public class ee {
   public static final Codec<ee> a = alg.a.xmap(ee::new, ee::a);
   private final alg b;
   private boolean c;
   private Optional<hx<ej>> d = Optional.empty();

   public ee(alg $$0) {
      this.b = $$0;
   }

   public Optional<hx<ej>> a(alv $$0) {
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
         if ($$0 instanceof ee $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
