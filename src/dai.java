import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dai extends dbu {
   public static final MapCodec<dai> b = b(dai::new);

   @Override
   public MapCodec<dai> a() {
      return b;
   }

   protected dai(dgv.d $$0) {
      super(dbu.b.e, $$0);
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, @Nullable bky $$3, clb $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof dgc $$6) {
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
