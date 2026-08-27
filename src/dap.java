import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dap extends dcb {
   public static final MapCodec<dap> b = b(dap::new);

   @Override
   public MapCodec<dap> a() {
      return b;
   }

   protected dap(dhh.d $$0) {
      super(dcb.b.e, $$0);
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, @Nullable blg $$3, clj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof dgo $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            rz $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = so.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.d, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
