import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcf extends ddr {
   public static final MapCodec<dcf> b = b(dcf::new);

   @Override
   public MapCodec<dcf> a() {
      return b;
   }

   protected dcf(djg.d $$0) {
      super(ddr.b.e, $$0);
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, @Nullable bml $$3, cmy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof dig $$6) {
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
