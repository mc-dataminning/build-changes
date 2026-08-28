import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dnv extends dis implements dim {
   public static final MapCodec<dnv> a = b(dnv::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dwl<jm> d = dwe.R;
   public static final dwn e = dwe.S;
   private static final BiFunction<jm, Integer, fal> f = ae.a(
      ($$0, $$1) -> {
         fal[] $$2 = new fal[]{
            dij.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dij.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dij.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dij.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         fal $$3 = fai.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = fai.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   protected dnv(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jm.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public dvo a(dvo $$0, dow $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dvo $$0, czw $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dvo a(czw $$0) {
      dvo $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.m().b(d, $$0.g().g());
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return true;
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cwf(this));
      }
   }
}
