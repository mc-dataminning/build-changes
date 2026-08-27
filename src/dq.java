import com.mojang.serialization.Codec;
import java.util.Optional;

public class dq {
   public static final Codec<dq> a = ajv.a.xmap(dq::new, dq::a);
   private final ajv b;
   private boolean c;
   private Optional<hh<dv>> d = Optional.empty();

   public dq(ajv $$0) {
      this.b = $$0;
   }

   public Optional<hh<dv>> a(akj $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public ajv a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof dq $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
