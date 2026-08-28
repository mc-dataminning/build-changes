import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface ffa {
   String cn = "*";
   ffa co = new ffa() {
      @Override
      public String cI() {
         return "*";
      }
   };

   String cI();

   @Nullable
   default ww m_() {
      return null;
   }

   default ww hc() {
      ww $$0 = this.m_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xc.e(ww.b(this.cI())))) : ww.b(this.cI());
   }

   static ffa c(final String $$0) {
      if ($$0.equals("*")) {
         return co;
      } else {
         final ww $$1 = ww.b($$0);
         return new ffa() {
            @Override
            public String cI() {
               return $$0;
            }

            @Override
            public ww hc() {
               return $$1;
            }
         };
      }
   }

   static ffa a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new ffa() {
         @Override
         public String cI() {
            return $$1;
         }
      };
   }
}
