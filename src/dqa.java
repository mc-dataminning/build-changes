import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dqa extends dkv implements dko {
   public static final MapCodec<dqa> a = b(dqa::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dyr<jm> d = dyk.S;
   public static final dyt e = dyk.T;
   private static final BiFunction<jm, Integer, fcr> f = ae.a(
      ($$0, $$1) -> {
         fcr[] $$2 = new fcr[]{
            dkl.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dkl.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dkl.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dkl.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         fcr $$3 = fco.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = fco.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dqa> a() {
      return a;
   }

   protected dqa(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jm.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public dxu a(dxu $$0, drb $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dxu $$0, dbf $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.m().b(d, $$0.g().g());
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return true;
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cxo(this));
      }
   }
}
