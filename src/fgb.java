import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fgb {
   String co = "*";
   fgb cp = new fgb() {
      @Override
      public String cH() {
         return "*";
      }
   };

   String cH();

   @Nullable
   default wy m_() {
      return null;
   }

   default wy hf() {
      wy $$0 = this.m_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xe.e(wy.b(this.cH())))) : wy.b(this.cH());
   }

   static fgb c(final String $$0) {
      if ($$0.equals("*")) {
         return cp;
      } else {
         final wy $$1 = wy.b($$0);
         return new fgb() {
            @Override
            public String cH() {
               return $$0;
            }

            @Override
            public wy hf() {
               return $$1;
            }
         };
      }
   }

   static fgb a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fgb() {
         @Override
         public String cH() {
            return $$1;
         }
      };
   }
}
