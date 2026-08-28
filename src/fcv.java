import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fcv {
   String cA = "*";
   fcv cB = new fcv() {
      @Override
      public String cI() {
         return "*";
      }
   };

   String cI();

   @Nullable
   default xk p_() {
      return null;
   }

   default xk hc() {
      xk $$0 = this.p_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xq(xq.a.a, xk.b(this.cI())))) : xk.b(this.cI());
   }

   static fcv c(final String $$0) {
      if ($$0.equals("*")) {
         return cB;
      } else {
         final xk $$1 = xk.b($$0);
         return new fcv() {
            @Override
            public String cI() {
               return $$0;
            }

            @Override
            public xk hc() {
               return $$1;
            }
         };
      }
   }

   static fcv a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fcv() {
         @Override
         public String cI() {
            return $$1;
         }
      };
   }
}
