import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fcc {
   String cA = "*";
   fcc cB = new fcc() {
      @Override
      public String cI() {
         return "*";
      }
   };

   String cI();

   @Nullable
   default wo p_() {
      return null;
   }

   default wo hd() {
      wo $$0 = this.p_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new wu(wu.a.a, wo.b(this.cI())))) : wo.b(this.cI());
   }

   static fcc c(final String $$0) {
      if ($$0.equals("*")) {
         return cB;
      } else {
         final wo $$1 = wo.b($$0);
         return new fcc() {
            @Override
            public String cI() {
               return $$0;
            }

            @Override
            public wo hd() {
               return $$1;
            }
         };
      }
   }

   static fcc a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fcc() {
         @Override
         public String cI() {
            return $$1;
         }
      };
   }
}
