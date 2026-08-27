import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface etm {
   String a_ = "*";
   etm cy = new etm() {
      @Override
      public String cy() {
         return "*";
      }
   };

   String cy();

   @Nullable
   default wi O_() {
      return null;
   }

   default wi hb() {
      wi $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new wo(wo.a.a, wi.b(this.cy())))) : wi.b(this.cy());
   }

   static etm c(final String $$0) {
      if ($$0.equals("*")) {
         return cy;
      } else {
         final wi $$1 = wi.b($$0);
         return new etm() {
            @Override
            public String cy() {
               return $$0;
            }

            @Override
            public wi hb() {
               return $$1;
            }
         };
      }
   }

   static etm a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new etm() {
         @Override
         public String cy() {
            return $$1;
         }
      };
   }
}
