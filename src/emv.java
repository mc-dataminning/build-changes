import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface emv {
   String a_ = "*";
   emv cv = new emv() {
      @Override
      public String cy() {
         return "*";
      }
   };

   String cy();

   @Nullable
   default vf Q_() {
      return null;
   }

   default vf gU() {
      vf $$0 = this.Q_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new vl(vl.a.a, vf.b(this.cy())))) : vf.b(this.cy());
   }

   static emv d(final String $$0) {
      if ($$0.equals("*")) {
         return cv;
      } else {
         final vf $$1 = vf.b($$0);
         return new emv() {
            @Override
            public String cy() {
               return $$0;
            }

            @Override
            public vf gU() {
               return $$1;
            }
         };
      }
   }

   static emv a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new emv() {
         @Override
         public String cy() {
            return $$1;
         }
      };
   }
}
