import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbo extends dda {
   public static final MapCodec<dbo> b = b(dbo::new);

   @Override
   public MapCodec<dbo> a() {
      return b;
   }

   protected dbo(dio.d $$0) {
      super(dda.b.e, $$0);
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, @Nullable blv $$3, cmh $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof dho $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            sj $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = sy.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.d, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
