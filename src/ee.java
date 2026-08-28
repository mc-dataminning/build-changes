import com.mojang.serialization.Codec;
import java.util.Optional;

public class ee {
   public static final Codec<ee> a = ali.a.xmap(ee::new, ee::a);
   private final ali b;
   private boolean c;
   private Optional<hx<ej>> d = Optional.empty();

   public ee(ali $$0) {
      this.b = $$0;
   }

   public Optional<hx<ej>> a(alx $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public ali a() {
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
