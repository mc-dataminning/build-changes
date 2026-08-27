import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcn extends ddz {
   public static final MapCodec<dcn> b = b(dcn::new);

   @Override
   public MapCodec<dcn> a() {
      return b;
   }

   protected dcn(djo.d $$0) {
      super(ddz.b.e, $$0);
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, @Nullable bmo $$3, cng $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof dio $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            so $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = td.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.d, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
