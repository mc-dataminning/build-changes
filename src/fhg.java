import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fhg {
   String co = "*";
   fhg cp = new fhg() {
      @Override
      public String cI() {
         return "*";
      }
   };

   String cI();

   @Nullable
   default xg m_() {
      return null;
   }

   default xg hg() {
      xg $$0 = this.m_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xm.e(xg.b(this.cI())))) : xg.b(this.cI());
   }

   static fhg c(final String $$0) {
      if ($$0.equals("*")) {
         return cp;
      } else {
         final xg $$1 = xg.b($$0);
         return new fhg() {
            @Override
            public String cI() {
               return $$0;
            }

            @Override
            public xg hg() {
               return $$1;
            }
         };
      }
   }

   static fhg a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fhg() {
         @Override
         public String cI() {
            return $$1;
         }
      };
   }
}
