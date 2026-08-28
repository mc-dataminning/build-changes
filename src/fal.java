import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fal {
   String a_ = "*";
   fal cz = new fal() {
      @Override
      public String cJ() {
         return "*";
      }
   };

   String cJ();

   @Nullable
   default xh S_() {
      return null;
   }

   default xh hk() {
      xh $$0 = this.S_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xn(xn.a.a, xh.b(this.cJ())))) : xh.b(this.cJ());
   }

   static fal c(final String $$0) {
      if ($$0.equals("*")) {
         return cz;
      } else {
         final xh $$1 = xh.b($$0);
         return new fal() {
            @Override
            public String cJ() {
               return $$0;
            }

            @Override
            public xh hk() {
               return $$1;
            }
         };
      }
   }

   static fal a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fal() {
         @Override
         public String cJ() {
            return $$1;
         }
      };
   }
}
