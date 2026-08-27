import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public class cyj extends czx {
   protected cyj(dfi.d $$0) {
      super(czx.b.c, $$0);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, @Nullable bjg $$3, cjf $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof def $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            qy $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = rk.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.d, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
