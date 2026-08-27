import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public class cxy extends czm {
   protected cxy(dex.d $$0) {
      super(czm.b.c, $$0);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, @Nullable biw $$3, ciw $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof ddu $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            qs $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = re.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.c, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
