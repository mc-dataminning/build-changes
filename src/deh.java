import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deh extends dft {
   public static final MapCodec<deh> b = b(deh::new);

   @Override
   public MapCodec<deh> a() {
      return b;
   }

   protected deh(dli.d $$0) {
      super(dft.b.e, $$0);
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, @Nullable boi $$3, cpd $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      b($$0, $$1, $$4);
   }

   public static void b(cvr $$0, hz $$1, cpd $$2) {
      if ($$0.c_($$1) instanceof dki $$3) {
         GameProfile $$4 = null;
         if ($$2.v()) {
            sw $$5 = $$2.w();
            if ($$5.b("SkullOwner", 10)) {
               $$4 = tl.a($$5.p("SkullOwner"));
            } else if ($$5.b("SkullOwner", 8) && !ac.b($$5.l("SkullOwner"))) {
               $$4 = new GameProfile(ac.d, $$5.l("SkullOwner"));
            }
         }

         $$3.a($$4);
      }
   }
}
