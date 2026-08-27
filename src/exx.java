import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface exx {
   String a_ = "*";
   exx cP = new exx() {
      @Override
      public String cG() {
         return "*";
      }
   };

   String cG();

   @Nullable
   default xe P_() {
      return null;
   }

   default xe hm() {
      xe $$0 = this.P_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xk(xk.a.a, xe.b(this.cG())))) : xe.b(this.cG());
   }

   static exx e(final String $$0) {
      if ($$0.equals("*")) {
         return cP;
      } else {
         final xe $$1 = xe.b($$0);
         return new exx() {
            @Override
            public String cG() {
               return $$0;
            }

            @Override
            public xe hm() {
               return $$1;
            }
         };
      }
   }

   static exx a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new exx() {
         @Override
         public String cG() {
            return $$1;
         }
      };
   }
}
