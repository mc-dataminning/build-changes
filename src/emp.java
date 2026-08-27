import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface emp {
   String a_ = "*";
   emp cv = new emp() {
      @Override
      public String cy() {
         return "*";
      }
   };

   String cy();

   @Nullable
   default vd Q_() {
      return null;
   }

   default vd gU() {
      vd $$0 = this.Q_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new vj(vj.a.a, vd.b(this.cy())))) : vd.b(this.cy());
   }

   static emp d(final String $$0) {
      if ($$0.equals("*")) {
         return cv;
      } else {
         final vd $$1 = vd.b($$0);
         return new emp() {
            @Override
            public String cy() {
               return $$0;
            }

            @Override
            public vd gU() {
               return $$1;
            }
         };
      }
   }

   static emp a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new emp() {
         @Override
         public String cy() {
            return $$1;
         }
      };
   }
}
