import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fdc {
   String cA = "*";
   fdc cB = new fdc() {
      @Override
      public String cI() {
         return "*";
      }
   };

   String cI();

   @Nullable
   default xv p_() {
      return null;
   }

   default xv hc() {
      xv $$0 = this.p_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new yb(yb.a.a, xv.b(this.cI())))) : xv.b(this.cI());
   }

   static fdc c(final String $$0) {
      if ($$0.equals("*")) {
         return cB;
      } else {
         final xv $$1 = xv.b($$0);
         return new fdc() {
            @Override
            public String cI() {
               return $$0;
            }

            @Override
            public xv hc() {
               return $$1;
            }
         };
      }
   }

   static fdc a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fdc() {
         @Override
         public String cI() {
            return $$1;
         }
      };
   }
}
