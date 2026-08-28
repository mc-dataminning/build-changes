import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dky extends dix implements dqr {
   public static final MapCodec<dky> a = b(dky::new);
   public static final dxn b = dxm.J;
   private static final int d = 3;
   protected static final fbt c = djl.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   public dky(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new duk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return a($$2, dua.A, $$0.C ? duk::a : duk::b);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(b) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
