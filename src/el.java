import com.mojang.serialization.Codec;
import java.util.Optional;

public class el {
   public static final Codec<el> a = akk.a.xmap(el::new, el::a);
   private final akk b;
   private boolean c;
   private Optional<ic<eq>> d = Optional.empty();

   public el(akk $$0) {
      this.b = $$0;
   }

   public Optional<ic<eq>> a(akz $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public akk a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof el $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
