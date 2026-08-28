import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dpb extends dju implements djn {
   public static final MapCodec<dpb> a = b(dpb::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dxs<jn> d = dxl.U;
   public static final dxu e = dxl.V;
   private static final BiFunction<jn, Integer, fbs> f = af.a(
      ($$0, $$1) -> {
         fbs[] $$2 = new fbs[]{
            djk.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            djk.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            djk.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            djk.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         fbs $$3 = fbp.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = fbp.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dpb> a() {
      return a;
   }

   protected dpb(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jn.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public dwv a(dwv $$0, dqc $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dwv $$0, dae $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dwv a(dae $$0) {
      dwv $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.m().b(d, $$0.g().g());
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return true;
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cwn(this));
      }
   }
}
