import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fav {
   String a_ = "*";
   fav cz = new fav() {
      @Override
      public String cK() {
         return "*";
      }
   };

   String cK();

   @Nullable
   default xl S_() {
      return null;
   }

   default xl hk() {
      xl $$0 = this.S_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xr(xr.a.a, xl.b(this.cK())))) : xl.b(this.cK());
   }

   static fav c(final String $$0) {
      if ($$0.equals("*")) {
         return cz;
      } else {
         final xl $$1 = xl.b($$0);
         return new fav() {
            @Override
            public String cK() {
               return $$0;
            }

            @Override
            public xl hk() {
               return $$1;
            }
         };
      }
   }

   static fav a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fav() {
         @Override
         public String cK() {
            return $$1;
         }
      };
   }
}
