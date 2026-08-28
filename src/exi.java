import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface exi {
   String a_ = "*";
   exi cA = new exi() {
      @Override
      public String cC() {
         return "*";
      }
   };

   String cC();

   @Nullable
   default wu O_() {
      return null;
   }

   default wu hc() {
      wu $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xa(xa.a.a, wu.b(this.cC())))) : wu.b(this.cC());
   }

   static exi c(final String $$0) {
      if ($$0.equals("*")) {
         return cA;
      } else {
         final wu $$1 = wu.b($$0);
         return new exi() {
            @Override
            public String cC() {
               return $$0;
            }

            @Override
            public wu hc() {
               return $$1;
            }
         };
      }
   }

   static exi a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new exi() {
         @Override
         public String cC() {
            return $$1;
         }
      };
   }
}
