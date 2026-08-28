import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface ewt {
   String a_ = "*";
   ewt cy = new ewt() {
      @Override
      public String cB() {
         return "*";
      }
   };

   String cB();

   @Nullable
   default xo O_() {
      return null;
   }

   default xo he() {
      xo $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xu(xu.a.a, xo.b(this.cB())))) : xo.b(this.cB());
   }

   static ewt c(final String $$0) {
      if ($$0.equals("*")) {
         return cy;
      } else {
         final xo $$1 = xo.b($$0);
         return new ewt() {
            @Override
            public String cB() {
               return $$0;
            }

            @Override
            public xo he() {
               return $$1;
            }
         };
      }
   }

   static ewt a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new ewt() {
         @Override
         public String cB() {
            return $$1;
         }
      };
   }
}
