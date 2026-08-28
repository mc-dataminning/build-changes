import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface eyf {
   String a_ = "*";
   eyf cC = new eyf() {
      @Override
      public String cB() {
         return "*";
      }
   };

   String cB();

   @Nullable
   default wz S_() {
      return null;
   }

   default wz gY() {
      wz $$0 = this.S_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xf(xf.a.a, wz.b(this.cB())))) : wz.b(this.cB());
   }

   static eyf c(final String $$0) {
      if ($$0.equals("*")) {
         return cC;
      } else {
         final wz $$1 = wz.b($$0);
         return new eyf() {
            @Override
            public String cB() {
               return $$0;
            }

            @Override
            public wz gY() {
               return $$1;
            }
         };
      }
   }

   static eyf a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new eyf() {
         @Override
         public String cB() {
            return $$1;
         }
      };
   }
}
