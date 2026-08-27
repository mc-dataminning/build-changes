import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czo extends dba {
   public static final MapCodec<czo> b = b(czo::new);

   @Override
   public MapCodec<czo> a() {
      return b;
   }

   protected czo(dga.d $$0) {
      super(dba.b.e, $$0);
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, @Nullable bkj $$3, ckj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.c_($$1) instanceof dfh $$6) {
         GameProfile $$7 = null;
         if ($$4.u()) {
            rt $$8 = $$4.v();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = sg.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(ac.d, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }
   }
}
