import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public class cya extends czo {
   protected cya(dez.d $$0) {
      super(czo.b.c, $$0);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, @Nullable biy $$3, ciy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof ddw $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            qr $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = rd.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.d, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
