import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fgw {
   String co = "*";
   fgw cp = new fgw() {
      @Override
      public String cI() {
         return "*";
      }
   };

   String cI();

   @Nullable
   default xc m_() {
      return null;
   }

   default xc hg() {
      xc $$0 = this.m_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xi.e(xc.b(this.cI())))) : xc.b(this.cI());
   }

   static fgw c(final String $$0) {
      if ($$0.equals("*")) {
         return cp;
      } else {
         final xc $$1 = xc.b($$0);
         return new fgw() {
            @Override
            public String cI() {
               return $$0;
            }

            @Override
            public xc hg() {
               return $$1;
            }
         };
      }
   }

   static fgw a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fgw() {
         @Override
         public String cI() {
            return $$1;
         }
      };
   }
}
