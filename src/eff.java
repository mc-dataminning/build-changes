import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eff extends eex {
   @Override
   public eey d() {
      return efa.b;
   }

   @Override
   public eey e() {
      return efa.c;
   }

   @Override
   public cnb a() {
      return cnj.qy;
   }

   @Override
   public void a(ctx $$0, hx $$1, eez $$2, auw $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, art.Bg, aru.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(jx.ai, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public jv h() {
      return jx.m;
   }

   @Override
   protected boolean a(ctx $$0) {
      return $$0.Z().b(ctt.U);
   }

   @Override
   protected void a(cty $$0, hx $$1, djp $$2) {
      dhd $$3 = $$2.t() ? $$0.c_($$1) : null;
      cwy.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cua $$0) {
      return 4;
   }

   @Override
   public djp b(eez $$0) {
      return cxa.G.o().a(dbn.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eey $$0) {
      return $$0 == efa.c || $$0 == efa.b;
   }

   @Override
   public int c(cua $$0) {
      return 1;
   }

   @Override
   public int a(cua $$0) {
      return 5;
   }

   @Override
   public boolean a(eez $$0, ctd $$1, hx $$2, eey $$3, ic $$4) {
      return $$4 == ic.a && !$$3.a(asn.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<ars> j() {
      return Optional.of(art.cZ);
   }

   public static class a extends eff {
      @Override
      protected void a(djq.a<eey, eez> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eez $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eez $$0) {
         return false;
      }
   }

   public static class b extends eff {
      @Override
      public int d(eez $$0) {
         return 8;
      }

      @Override
      public boolean c(eez $$0) {
         return true;
      }
   }
}
