import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fdy {
   String cm = "*";
   fdy cn = new fdy() {
      @Override
      public String cI() {
         return "*";
      }
   };

   String cI();

   @Nullable
   default wv m_() {
      return null;
   }

   default wv hc() {
      wv $$0 = this.m_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xb.e(wv.b(this.cI())))) : wv.b(this.cI());
   }

   static fdy c(final String $$0) {
      if ($$0.equals("*")) {
         return cn;
      } else {
         final wv $$1 = wv.b($$0);
         return new fdy() {
            @Override
            public String cI() {
               return $$0;
            }

            @Override
            public wv hc() {
               return $$1;
            }
         };
      }
   }

   static fdy a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fdy() {
         @Override
         public String cI() {
            return $$1;
         }
      };
   }
}
