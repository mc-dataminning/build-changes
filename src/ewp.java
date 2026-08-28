import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface ewp {
   String a_ = "*";
   ewp cy = new ewp() {
      @Override
      public String cB() {
         return "*";
      }
   };

   String cB();

   @Nullable
   default xl O_() {
      return null;
   }

   default xl he() {
      xl $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xr(xr.a.a, xl.b(this.cB())))) : xl.b(this.cB());
   }

   static ewp c(final String $$0) {
      if ($$0.equals("*")) {
         return cy;
      } else {
         final xl $$1 = xl.b($$0);
         return new ewp() {
            @Override
            public String cB() {
               return $$0;
            }

            @Override
            public xl he() {
               return $$1;
            }
         };
      }
   }

   static ewp a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new ewp() {
         @Override
         public String cB() {
            return $$1;
         }
      };
   }
}
