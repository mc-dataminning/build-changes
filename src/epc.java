import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface epc {
   String a_ = "*";
   epc cv = new epc() {
      @Override
      public String cy() {
         return "*";
      }
   };

   String cy();

   @Nullable
   default vq Q_() {
      return null;
   }

   default vq gW() {
      vq $$0 = this.Q_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new vw(vw.a.a, vq.b(this.cy())))) : vq.b(this.cy());
   }

   static epc d(final String $$0) {
      if ($$0.equals("*")) {
         return cv;
      } else {
         final vq $$1 = vq.b($$0);
         return new epc() {
            @Override
            public String cy() {
               return $$0;
            }

            @Override
            public vq gW() {
               return $$1;
            }
         };
      }
   }

   static epc a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new epc() {
         @Override
         public String cy() {
            return $$1;
         }
      };
   }
}
