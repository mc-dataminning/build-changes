import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfp extends dhb {
   public static final MapCodec<dfp> b = b(dfp::new);

   @Override
   public MapCodec<dfp> a() {
      return b;
   }

   protected dfp(dmy.d $$0) {
      super(dhb.b.e, $$0);
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, @Nullable bpo $$3, cqk $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      b($$0, $$1, $$4);
   }

   public static void b(cwz $$0, ib $$1, cqk $$2) {
      if ($$0.c_($$1) instanceof dlr $$3) {
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
