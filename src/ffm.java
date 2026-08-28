import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface ffm {
   String cn = "*";
   ffm co = new ffm() {
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

   default wy hc() {
      wy $$0 = this.m_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xe.e(wy.b(this.cI())))) : wy.b(this.cI());
   }

   static ffm c(final String $$0) {
      if ($$0.equals("*")) {
         return co;
      } else {
         final wy $$1 = wy.b($$0);
         return new ffm() {
            @Override
            public String cI() {
               return $$0;
            }

            @Override
            public wy hc() {
               return $$1;
            }
         };
      }
   }

   static ffm a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new ffm() {
         @Override
         public String cI() {
            return $$1;
         }
      };
   }
}
