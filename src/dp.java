import com.mojang.serialization.Codec;
import java.util.Optional;

public class dp {
   public static final Codec<dp> a = ajc.a.xmap(dp::new, dp::a);
   private final ajc b;
   private boolean c;
   private Optional<hf<du>> d = Optional.empty();

   public dp(ajc $$0) {
      this.b = $$0;
   }

   public Optional<hf<du>> a(ajq $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public ajc a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof dp $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
