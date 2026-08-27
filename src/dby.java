import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dby extends ddk {
   public static final MapCodec<dby> b = b(dby::new);

   @Override
   public MapCodec<dby> a() {
      return b;
   }

   protected dby(diz.d $$0) {
      super(ddk.b.e, $$0);
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, @Nullable bmf $$3, cmr $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof dhz $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            sl $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = ta.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.d, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
