import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface eqw {
   String a_ = "*";
   eqw cy = new eqw() {
      @Override
      public String cy() {
         return "*";
      }
   };

   String cy();

   @Nullable
   default vu O_() {
      return null;
   }

   default vu hb() {
      vu $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new wa(wa.a.a, vu.b(this.cy())))) : vu.b(this.cy());
   }

   static eqw d(final String $$0) {
      if ($$0.equals("*")) {
         return cy;
      } else {
         final vu $$1 = vu.b($$0);
         return new eqw() {
            @Override
            public String cy() {
               return $$0;
            }

            @Override
            public vu hb() {
               return $$1;
            }
         };
      }
   }

   static eqw a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new eqw() {
         @Override
         public String cy() {
            return $$1;
         }
      };
   }
}
