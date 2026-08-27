import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eit extends eil {
   @Override
   public eim d() {
      return eio.b;
   }

   @Override
   public eim e() {
      return eio.c;
   }

   @Override
   public cqf a() {
      return cqn.qy;
   }

   @Override
   public void a(cwz $$0, ib $$1, ein $$2, axd $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aty.Bx, atz.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(kc.aj, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public ka h() {
      return kc.m;
   }

   @Override
   protected boolean a(cwz $$0) {
      return $$0.Z().b(cwv.U);
   }

   @Override
   protected void a(cxa $$0, ib $$1, dmz $$2) {
      dkg $$3 = $$2.t() ? $$0.c_($$1) : null;
      daa.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cxc $$0) {
      return 4;
   }

   @Override
   public dmz b(ein $$0) {
      return dac.G.o().a(dep.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eim $$0) {
      return $$0 == eio.c || $$0 == eio.b;
   }

   @Override
   public int c(cxc $$0) {
      return 1;
   }

   @Override
   public int a(cxc $$0) {
      return 5;
   }

   @Override
   public boolean a(ein $$0, cwf $$1, ib $$2, eim $$3, ih $$4) {
      return $$4 == ih.a && !$$3.a(aus.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<atx> j() {
      return Optional.of(aty.dd);
   }

   public static class a extends eit {
      @Override
      protected void a(dna.a<eim, ein> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ein $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ein $$0) {
         return false;
      }
   }

   public static class b extends eit {
      @Override
      public int d(ein $$0) {
         return 8;
      }

      @Override
      public boolean c(ein $$0) {
         return true;
      }
   }
}
