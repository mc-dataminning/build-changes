import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ded extends dfp {
   public static final MapCodec<ded> b = b(ded::new);

   @Override
   public MapCodec<ded> a() {
      return b;
   }

   protected ded(dle.d $$0) {
      super(dfp.b.e, $$0);
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, @Nullable bog $$3, coz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      b($$0, $$1, $$4);
   }

   public static void b(cvn $$0, hz $$1, coz $$2) {
      if ($$0.c_($$1) instanceof dke $$3) {
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
