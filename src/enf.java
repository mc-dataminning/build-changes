import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface enf {
   String a_ = "*";
   enf cw = new enf() {
      @Override
      public String cy() {
         return "*";
      }
   };

   String cy();

   @Nullable
   default vg Q_() {
      return null;
   }

   default vg gV() {
      vg $$0 = this.Q_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new vm(vm.a.a, vg.b(this.cy())))) : vg.b(this.cy());
   }

   static enf d(final String $$0) {
      if ($$0.equals("*")) {
         return cw;
      } else {
         final vg $$1 = vg.b($$0);
         return new enf() {
            @Override
            public String cy() {
               return $$0;
            }

            @Override
            public vg gV() {
               return $$1;
            }
         };
      }
   }

   static enf a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new enf() {
         @Override
         public String cy() {
            return $$1;
         }
      };
   }
}
