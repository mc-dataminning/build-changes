import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dpe extends djx implements djq {
   public static final MapCodec<dpe> a = b(dpe::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dxv<jn> d = dxo.U;
   public static final dxx e = dxo.V;
   private static final BiFunction<jn, Integer, fbv> f = af.a(
      ($$0, $$1) -> {
         fbv[] $$2 = new fbv[]{
            djn.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            djn.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            djn.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            djn.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         fbv $$3 = fbs.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = fbs.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dpe> a() {
      return a;
   }

   protected dpe(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jn.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public dwy a(dwy $$0, dqf $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dwy $$0, dah $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dwy a(dah $$0) {
      dwy $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.m().b(d, $$0.g().g());
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return true;
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cwq(this));
      }
   }
}
