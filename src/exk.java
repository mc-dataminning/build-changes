import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface exk {
   String a_ = "*";
   exk cB = new exk() {
      @Override
      public String cD() {
         return "*";
      }
   };

   String cD();

   @Nullable
   default wu O_() {
      return null;
   }

   default wu hb() {
      wu $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xa(xa.a.a, wu.b(this.cD())))) : wu.b(this.cD());
   }

   static exk c(final String $$0) {
      if ($$0.equals("*")) {
         return cB;
      } else {
         final wu $$1 = wu.b($$0);
         return new exk() {
            @Override
            public String cD() {
               return $$0;
            }

            @Override
            public wu hb() {
               return $$1;
            }
         };
      }
   }

   static exk a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new exk() {
         @Override
         public String cD() {
            return $$1;
         }
      };
   }
}
