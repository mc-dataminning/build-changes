import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dpd extends djw implements djp {
   public static final MapCodec<dpd> a = b(dpd::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dxu<jn> d = dxn.U;
   public static final dxw e = dxn.V;
   private static final BiFunction<jn, Integer, fbu> f = af.a(
      ($$0, $$1) -> {
         fbu[] $$2 = new fbu[]{
            djm.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            djm.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            djm.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            djm.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         fbu $$3 = fbr.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = fbr.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   protected dpd(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jn.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public dwx a(dwx $$0, dqe $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dwx $$0, dag $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dwx a(dag $$0) {
      dwx $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.m().b(d, $$0.g().g());
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return true;
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cwp(this));
      }
   }
}
