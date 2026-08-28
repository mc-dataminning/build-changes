import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fgu {
   String co = "*";
   fgu cp = new fgu() {
      @Override
      public String cI() {
         return "*";
      }
   };

   String cI();

   @Nullable
   default xa m_() {
      return null;
   }

   default xa hg() {
      xa $$0 = this.m_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xg.e(xa.b(this.cI())))) : xa.b(this.cI());
   }

   static fgu c(final String $$0) {
      if ($$0.equals("*")) {
         return cp;
      } else {
         final xa $$1 = xa.b($$0);
         return new fgu() {
            @Override
            public String cI() {
               return $$0;
            }

            @Override
            public xa hg() {
               return $$1;
            }
         };
      }
   }

   static fgu a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fgu() {
         @Override
         public String cI() {
            return $$1;
         }
      };
   }
}
