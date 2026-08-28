import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface exc {
   String a_ = "*";
   exc cA = new exc() {
      @Override
      public String cB() {
         return "*";
      }
   };

   String cB();

   @Nullable
   default wu O_() {
      return null;
   }

   default wu hb() {
      wu $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xa(xa.a.a, wu.b(this.cB())))) : wu.b(this.cB());
   }

   static exc c(final String $$0) {
      if ($$0.equals("*")) {
         return cA;
      } else {
         final wu $$1 = wu.b($$0);
         return new exc() {
            @Override
            public String cB() {
               return $$0;
            }

            @Override
            public wu hb() {
               return $$1;
            }
         };
      }
   }

   static exc a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new exc() {
         @Override
         public String cB() {
            return $$1;
         }
      };
   }
}
