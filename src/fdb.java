import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fdb {
   String cn = "*";
   fdb co = new fdb() {
      @Override
      public String cH() {
         return "*";
      }
   };

   String cH();

   @Nullable
   default wp m_() {
      return null;
   }

   default wp hg() {
      wp $$0 = this.m_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new wv.e(wp.b(this.cH())))) : wp.b(this.cH());
   }

   static fdb c(final String $$0) {
      if ($$0.equals("*")) {
         return co;
      } else {
         final wp $$1 = wp.b($$0);
         return new fdb() {
            @Override
            public String cH() {
               return $$0;
            }

            @Override
            public wp hg() {
               return $$1;
            }
         };
      }
   }

   static fdb a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fdb() {
         @Override
         public String cH() {
            return $$1;
         }
      };
   }
}
