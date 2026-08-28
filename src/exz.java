import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface exz {
   String a_ = "*";
   exz cA = new exz() {
      @Override
      public String cC() {
         return "*";
      }
   };

   String cC();

   @Nullable
   default wy O_() {
      return null;
   }

   default wy ha() {
      wy $$0 = this.O_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xe(xe.a.a, wy.b(this.cC())))) : wy.b(this.cC());
   }

   static exz c(final String $$0) {
      if ($$0.equals("*")) {
         return cA;
      } else {
         final wy $$1 = wy.b($$0);
         return new exz() {
            @Override
            public String cC() {
               return $$0;
            }

            @Override
            public wy ha() {
               return $$1;
            }
         };
      }
   }

   static exz a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new exz() {
         @Override
         public String cC() {
            return $$1;
         }
      };
   }
}
