import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface ewu {
   String a_ = "*";
   ewu cy = new ewu() {
      @Override
      public String cB() {
         return "*";
      }
   };

   String cB();

   @Nullable
   default xp O_() {
      return null;
   }

   default xp he() {
      xp $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xv(xv.a.a, xp.b(this.cB())))) : xp.b(this.cB());
   }

   static ewu c(final String $$0) {
      if ($$0.equals("*")) {
         return cy;
      } else {
         final xp $$1 = xp.b($$0);
         return new ewu() {
            @Override
            public String cB() {
               return $$0;
            }

            @Override
            public xp he() {
               return $$1;
            }
         };
      }
   }

   static ewu a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new ewu() {
         @Override
         public String cB() {
            return $$1;
         }
      };
   }
}
