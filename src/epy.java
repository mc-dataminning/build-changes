import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface epy {
   String a_ = "*";
   epy cw = new epy() {
      @Override
      public String cv() {
         return "*";
      }
   };

   String cv();

   @Nullable
   default vs Q_() {
      return null;
   }

   default vs ha() {
      vs $$0 = this.Q_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new vy(vy.a.a, vs.b(this.cv())))) : vs.b(this.cv());
   }

   static epy d(final String $$0) {
      if ($$0.equals("*")) {
         return cw;
      } else {
         final vs $$1 = vs.b($$0);
         return new epy() {
            @Override
            public String cv() {
               return $$0;
            }

            @Override
            public vs ha() {
               return $$1;
            }
         };
      }
   }

   static epy a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new epy() {
         @Override
         public String cv() {
            return $$1;
         }
      };
   }
}
