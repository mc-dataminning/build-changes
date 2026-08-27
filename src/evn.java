import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface evn {
   String a_ = "*";
   evn cz = new evn() {
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

   static evn c(final String $$0) {
      if ($$0.equals("*")) {
         return cz;
      } else {
         final wx $$1 = wx.b($$0);
         return new evn() {
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

   static evn a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new evn() {
         @Override
         public String cB() {
            return $$1;
         }
      };
   }
}
