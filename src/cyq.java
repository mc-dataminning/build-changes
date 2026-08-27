import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyq extends dac {
   public static final MapCodec<cyq> b = b(cyq::new);

   @Override
   public MapCodec<cyq> a() {
      return b;
   }

   protected cyq(dfc.d $$0) {
      super(dac.b.e, $$0);
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, @Nullable bjm $$3, cjl $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof dej $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            qw $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = rj.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.d, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
