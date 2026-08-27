import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface eus {
   String a_ = "*";
   eus cz = new eus() {
      @Override
      public String cz() {
         return "*";
      }
   };

   String cz();

   @Nullable
   default wu O_() {
      return null;
   }

   default wu hd() {
      wu $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xa(xa.a.a, wu.b(this.cz())))) : wu.b(this.cz());
   }

   static eus c(final String $$0) {
      if ($$0.equals("*")) {
         return cz;
      } else {
         final wu $$1 = wu.b($$0);
         return new eus() {
            @Override
            public String cz() {
               return $$0;
            }

            @Override
            public wu hd() {
               return $$1;
            }
         };
      }
   }

   static eus a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new eus() {
         @Override
         public String cz() {
            return $$1;
         }
      };
   }
}
