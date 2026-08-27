import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface eui {
   String a_ = "*";
   eui cz = new eui() {
      @Override
      public String cz() {
         return "*";
      }
   };

   String cz();

   @Nullable
   default ws O_() {
      return null;
   }

   default ws hd() {
      ws $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new wy(wy.a.a, ws.b(this.cz())))) : ws.b(this.cz());
   }

   static eui c(final String $$0) {
      if ($$0.equals("*")) {
         return cz;
      } else {
         final ws $$1 = ws.b($$0);
         return new eui() {
            @Override
            public String cz() {
               return $$0;
            }

            @Override
            public ws hd() {
               return $$1;
            }
         };
      }
   }

   static eui a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new eui() {
         @Override
         public String cz() {
            return $$1;
         }
      };
   }
}
