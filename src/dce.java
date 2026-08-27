import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dce extends ddq {
   public static final MapCodec<dce> b = b(dce::new);

   @Override
   public MapCodec<dce> a() {
      return b;
   }

   protected dce(djf.d $$0) {
      super(ddq.b.e, $$0);
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, @Nullable bmk $$3, cmx $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof dif $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            sn $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = tc.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.d, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
