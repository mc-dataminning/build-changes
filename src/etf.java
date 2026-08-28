import java.util.Optional;
import javax.annotation.Nullable;

public abstract class etf extends esx {
   @Override
   public esy d() {
      return eta.b;
   }

   @Override
   public esy e() {
      return eta.c;
   }

   @Override
   public cwl a() {
      return cwt.rg;
   }

   @Override
   public void a(dgi $$0, ji $$1, esz $$2, azh $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.CR, awb.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lt.an, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lr h() {
      return lt.l;
   }

   @Override
   protected boolean a(arc $$0) {
      return $$0.O().b(dge.V);
   }

   @Override
   protected void a(dgj $$0, ji $$1, dwx $$2) {
      dtz $$3 = $$2.x() ? $$0.c_($$1) : null;
      djm.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dgl $$0) {
      return 4;
   }

   @Override
   public dwx b(esz $$0) {
      return djo.J.m().b(doe.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(esy $$0) {
      return $$0 == eta.c || $$0 == eta.b;
   }

   @Override
   public int c(dgl $$0) {
      return 1;
   }

   @Override
   public int a(dgl $$0) {
      return 5;
   }

   @Override
   public boolean a(esz $$0, dfn $$1, ji $$2, esy $$3, jn $$4) {
      return $$4 == jn.a && !$$3.a(awv.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avz> j() {
      return Optional.of(awa.dj);
   }

   public static class a extends etf {
      @Override
      protected void a(dwy.a<esy, esz> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(esz $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(esz $$0) {
         return false;
      }
   }

   public static class b extends etf {
      @Override
      public int d(esz $$0) {
         return 8;
      }

      @Override
      public boolean c(esz $$0) {
         return true;
      }
   }
}
