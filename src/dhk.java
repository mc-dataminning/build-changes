import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dhk extends dch implements dcb {
   public static final MapCodec<dhk> a = b(dhk::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dpt d = dpp.R;
   public static final dpz e = dpp.S;
   private static final BiFunction<ih, Integer, est> f = ac.a(
      ($$0, $$1) -> {
         est[] $$2 = new est[]{
            dby.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dby.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dby.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dby.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         est $$3 = esq.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = esq.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   protected dhk(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ih.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public doz a(doz $$0, dik $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(doz $$0, cuo $$1) {
      return !$$1.h() && $$1.n().a(this.p()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public doz a(cuo $$0) {
      doz $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.n().a(d, $$0.g().g());
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return true;
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new crj(this));
      }
   }
}
