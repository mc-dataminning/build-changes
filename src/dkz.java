import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkz extends diy implements dqs {
   public static final MapCodec<dkz> a = b(dkz::new);
   public static final dxo b = dxn.J;
   private static final int d = 3;
   protected static final fbu c = djm.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dkz> a() {
      return a;
   }

   public dkz(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dul($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return a($$2, dub.A, $$0.C ? dul::a : dul::b);
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.b;
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(b) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c;
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
