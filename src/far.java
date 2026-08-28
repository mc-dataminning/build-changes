import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface far {
   String a_ = "*";
   far cz = new far() {
      @Override
      public String cJ() {
         return "*";
      }
   };

   String cJ();

   @Nullable
   default xi S_() {
      return null;
   }

   default xi hj() {
      xi $$0 = this.S_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xo(xo.a.a, xi.b(this.cJ())))) : xi.b(this.cJ());
   }

   static far c(final String $$0) {
      if ($$0.equals("*")) {
         return cz;
      } else {
         final xi $$1 = xi.b($$0);
         return new far() {
            @Override
            public String cJ() {
               return $$0;
            }

            @Override
            public xi hj() {
               return $$1;
            }
         };
      }
   }

   static far a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new far() {
         @Override
         public String cJ() {
            return $$1;
         }
      };
   }
}
