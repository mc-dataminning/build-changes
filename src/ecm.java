import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ecm extends ece {
   @Override
   public ecf d() {
      return ech.b;
   }

   @Override
   public ecf e() {
      return ech.c;
   }

   @Override
   public ckw a() {
      return cle.pL;
   }

   @Override
   public void a(crs $$0, ht $$1, ecg $$2, ato $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aqn.zV, aqo.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(js.ag, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public jq h() {
      return js.m;
   }

   @Override
   protected boolean a(crs $$0) {
      return $$0.X().b(cro.U);
   }

   @Override
   protected void a(crt $$0, ht $$1, dgw $$2) {
      der $$3 = $$2.t() ? $$0.c_($$1) : null;
      cut.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(crv $$0) {
      return 4;
   }

   @Override
   public dgw b(ecg $$0) {
      return cuv.G.o().a(czi.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ecf $$0) {
      return $$0 == ech.c || $$0 == ech.b;
   }

   @Override
   public int c(crv $$0) {
      return 1;
   }

   @Override
   public int a(crv $$0) {
      return 5;
   }

   @Override
   public boolean a(ecg $$0, cqy $$1, ht $$2, ecf $$3, hx $$4) {
      return $$4 == hx.a && !$$3.a(arh.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<aqm> j() {
      return Optional.of(aqn.cB);
   }

   public static class a extends ecm {
      @Override
      protected void a(dgx.a<ecf, ecg> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ecg $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ecg $$0) {
         return false;
      }
   }

   public static class b extends ecm {
      @Override
      public int d(ecg $$0) {
         return 8;
      }

      @Override
      public boolean c(ecg $$0) {
         return true;
      }
   }
}
