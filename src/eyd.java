import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface eyd {
   String a_ = "*";
   eyd cA = new eyd() {
      @Override
      public String cC() {
         return "*";
      }
   };

   String cC();

   @Nullable
   default wz S_() {
      return null;
   }

   default wz gZ() {
      wz $$0 = this.S_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xf(xf.a.a, wz.b(this.cC())))) : wz.b(this.cC());
   }

   static eyd c(final String $$0) {
      if ($$0.equals("*")) {
         return cA;
      } else {
         final wz $$1 = wz.b($$0);
         return new eyd() {
            @Override
            public String cC() {
               return $$0;
            }

            @Override
            public wz gZ() {
               return $$1;
            }
         };
      }
   }

   static eyd a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new eyd() {
         @Override
         public String cC() {
            return $$1;
         }
      };
   }
}
