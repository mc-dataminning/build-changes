import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eef extends edx {
   @Override
   public edy d() {
      return eea.b;
   }

   @Override
   public edy e() {
      return eea.c;
   }

   @Override
   public cmc a() {
      return cmk.qw;
   }

   @Override
   public void a(csy $$0, hv $$1, edz $$2, auf $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, arc.AR, ard.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(jv.ai, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public jt h() {
      return jv.m;
   }

   @Override
   protected boolean a(csy $$0) {
      return $$0.Y().b(csu.U);
   }

   @Override
   protected void a(csz $$0, hv $$1, dip $$2) {
      dgd $$3 = $$2.t() ? $$0.c_($$1) : null;
      cvz.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(ctb $$0) {
      return 4;
   }

   @Override
   public dip b(edz $$0) {
      return cwb.G.o().a(dao.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(edy $$0) {
      return $$0 == eea.c || $$0 == eea.b;
   }

   @Override
   public int c(ctb $$0) {
      return 1;
   }

   @Override
   public int a(ctb $$0) {
      return 5;
   }

   @Override
   public boolean a(edz $$0, cse $$1, hv $$2, edy $$3, ia $$4) {
      return $$4 == ia.a && !$$3.a(arw.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<arb> j() {
      return Optional.of(arc.cK);
   }

   public static class a extends eef {
      @Override
      protected void a(diq.a<edy, edz> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(edz $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(edz $$0) {
         return false;
      }
   }

   public static class b extends eef {
      @Override
      public int d(edz $$0) {
         return 8;
      }

      @Override
      public boolean c(edz $$0) {
         return true;
      }
   }
}
