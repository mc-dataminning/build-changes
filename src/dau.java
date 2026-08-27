import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dau extends dcg {
   public static final MapCodec<dau> b = b(dau::new);

   @Override
   public MapCodec<dau> a() {
      return b;
   }

   protected dau(dhm.d $$0) {
      super(dcg.b.e, $$0);
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, @Nullable bll $$3, clo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof dgt $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            sd $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = ss.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.d, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
