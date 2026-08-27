import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface evp {
   String a_ = "*";
   evp cy = new evp() {
      @Override
      public String cB() {
         return "*";
      }
   };

   String cB();

   @Nullable
   default wx O_() {
      return null;
   }

   default wx hd() {
      wx $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xd(xd.a.a, wx.b(this.cB())))) : wx.b(this.cB());
   }

   static evp c(final String $$0) {
      if ($$0.equals("*")) {
         return cy;
      } else {
         final wx $$1 = wx.b($$0);
         return new evp() {
            @Override
            public String cB() {
               return $$0;
            }

            @Override
            public wx hd() {
               return $$1;
            }
         };
      }
   }

   static evp a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new evp() {
         @Override
         public String cB() {
            return $$1;
         }
      };
   }
}
