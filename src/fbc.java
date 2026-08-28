import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fbc {
   String cz = "*";
   fbc cA = new fbc() {
      @Override
      public String cI() {
         return "*";
      }
   };

   String cI();

   @Nullable
   default xj o_() {
      return null;
   }

   default xj ha() {
      xj $$0 = this.o_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xp(xp.a.a, xj.b(this.cI())))) : xj.b(this.cI());
   }

   static fbc c(final String $$0) {
      if ($$0.equals("*")) {
         return cA;
      } else {
         final xj $$1 = xj.b($$0);
         return new fbc() {
            @Override
            public String cI() {
               return $$0;
            }

            @Override
            public xj ha() {
               return $$1;
            }
         };
      }
   }

   static fbc a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fbc() {
         @Override
         public String cI() {
            return $$1;
         }
      };
   }
}
