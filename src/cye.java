import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public class cye extends czs {
   protected cye(dfd.d $$0) {
      super(czs.b.c, $$0);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, @Nullable bjb $$3, cja $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof dea $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            qu $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = rg.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.d, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
