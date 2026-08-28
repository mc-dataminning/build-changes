import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface ezh {
   String a_ = "*";
   ezh cA = new ezh() {
      @Override
      public String cF() {
         return "*";
      }
   };

   String cF();

   @Nullable
   default xd Q_() {
      return null;
   }

   default xd he() {
      xd $$0 = this.Q_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xj(xj.a.a, xd.b(this.cF())))) : xd.b(this.cF());
   }

   static ezh c(final String $$0) {
      if ($$0.equals("*")) {
         return cA;
      } else {
         final xd $$1 = xd.b($$0);
         return new ezh() {
            @Override
            public String cF() {
               return $$0;
            }

            @Override
            public xd he() {
               return $$1;
            }
         };
      }
   }

   static ezh a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new ezh() {
         @Override
         public String cF() {
            return $$1;
         }
      };
   }
}
