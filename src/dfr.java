import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfr extends dhd {
   public static final MapCodec<dfr> b = b(dfr::new);

   @Override
   public MapCodec<dfr> a() {
      return b;
   }

   protected dfr(dna.d $$0) {
      super(dhd.b.e, $$0);
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, @Nullable bpp $$3, cqm $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      b($$0, $$1, $$4);
   }

   public static void b(cxb $$0, ib $$1, cqm $$2) {
      if ($$0.c_($$1) instanceof dlt $$3) {
         GameProfile $$4 = null;
         if ($$2.v()) {
            ta $$5 = $$2.w();
            if ($$5.b("SkullOwner", 10)) {
               $$4 = tp.a($$5.p("SkullOwner"));
            } else if ($$5.b("SkullOwner", 8) && !ac.b($$5.l("SkullOwner"))) {
               $$4 = new GameProfile(ac.d, $$5.l("SkullOwner"));
            }
         }

         $$3.a($$4);
      }
   }
}
