import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface ffu {
   String co = "*";
   ffu cp = new ffu() {
      @Override
      public String cI() {
         return "*";
      }
   };

   String cI();

   @Nullable
   default wy m_() {
      return null;
   }

   default wy hd() {
      wy $$0 = this.m_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xe.e(wy.b(this.cI())))) : wy.b(this.cI());
   }

   static ffu c(final String $$0) {
      if ($$0.equals("*")) {
         return cp;
      } else {
         final wy $$1 = wy.b($$0);
         return new ffu() {
            @Override
            public String cI() {
               return $$0;
            }

            @Override
            public wy hd() {
               return $$1;
            }
         };
      }
   }

   static ffu a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new ffu() {
         @Override
         public String cI() {
            return $$1;
         }
      };
   }
}
