import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public class cyl extends czz {
   protected cyl(dfk.d $$0) {
      super(czz.b.c, $$0);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, @Nullable bji $$3, cjh $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof deh $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            qy $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = rl.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.d, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
