import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface etd {
   String a_ = "*";
   etd cy = new etd() {
      @Override
      public String cy() {
         return "*";
      }
   };

   String cy();

   @Nullable
   default wg O_() {
      return null;
   }

   default wg hb() {
      wg $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new wm(wm.a.a, wg.b(this.cy())))) : wg.b(this.cy());
   }

   static etd c(final String $$0) {
      if ($$0.equals("*")) {
         return cy;
      } else {
         final wg $$1 = wg.b($$0);
         return new etd() {
            @Override
            public String cy() {
               return $$0;
            }

            @Override
            public wg hb() {
               return $$1;
            }
         };
      }
   }

   static etd a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new etd() {
         @Override
         public String cy() {
            return $$1;
         }
      };
   }
}
