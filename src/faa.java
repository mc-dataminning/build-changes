import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface faa {
   String a_ = "*";
   faa cz = new faa() {
      @Override
      public String cF() {
         return "*";
      }
   };

   String cF();

   @Nullable
   default xe R_() {
      return null;
   }

   default xe he() {
      xe $$0 = this.R_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xk(xk.a.a, xe.b(this.cF())))) : xe.b(this.cF());
   }

   static faa c(final String $$0) {
      if ($$0.equals("*")) {
         return cz;
      } else {
         final xe $$1 = xe.b($$0);
         return new faa() {
            @Override
            public String cF() {
               return $$0;
            }

            @Override
            public xe he() {
               return $$1;
            }
         };
      }
   }

   static faa a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new faa() {
         @Override
         public String cF() {
            return $$1;
         }
      };
   }
}
