import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deu extends dgg {
   public static final MapCodec<deu> b = b(deu::new);

   @Override
   public MapCodec<deu> a() {
      return b;
   }

   protected deu(dmd.d $$0) {
      super(dgg.b.e, $$0);
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, @Nullable box $$3, cpq $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      b($$0, $$1, $$4);
   }

   public static void b(cwe $$0, ib $$1, cpq $$2) {
      if ($$0.c_($$1) instanceof dkw $$3) {
         GameProfile $$4 = null;
         if ($$2.v()) {
            sy $$5 = $$2.w();
            if ($$5.b("SkullOwner", 10)) {
               $$4 = tn.a($$5.p("SkullOwner"));
            } else if ($$5.b("SkullOwner", 8) && !ac.b($$5.l("SkullOwner"))) {
               $$4 = new GameProfile(ac.d, $$5.l("SkullOwner"));
            }
         }

         $$3.a($$4);
      }
   }
}
