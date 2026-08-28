import com.mojang.serialization.Codec;
import java.util.Optional;

public class eq {
   public static final Codec<eq> a = alh.a.xmap(eq::new, eq::a);
   private final alh b;
   private boolean c;
   private Optional<ij<ev>> d = Optional.empty();

   public eq(alh $$0) {
      this.b = $$0;
   }

   public Optional<ij<ev>> a(alw $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public alh a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof eq $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
