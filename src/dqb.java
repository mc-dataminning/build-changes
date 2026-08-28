import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dqb extends dkw implements dkp {
   public static final MapCodec<dqb> a = b(dqb::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dys<jm> d = dyl.S;
   public static final dyu e = dyl.T;
   private static final BiFunction<jm, Integer, fcs> f = ae.a(
      ($$0, $$1) -> {
         fcs[] $$2 = new fcs[]{
            dkm.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dkm.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dkm.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dkm.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         fcs $$3 = fcp.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = fcp.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   protected dqb(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jm.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public dxv a(dxv $$0, drc $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dxv $$0, dbg $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.m().b(d, $$0.g().g());
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return true;
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cxp(this));
      }
   }
}
