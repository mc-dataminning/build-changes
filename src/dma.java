import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dma extends djq {
   public static final MapCodec<dma> a = b(dma::new);
   public static final dyk<jm.a> b = dyd.J;
   public static final dyk<dma.a> c = dyd.bB;

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   protected dma(dxm.d $$0) {
      super($$0);
      this.l(this.m().b(b, jm.a.b).b(c, dma.a.a));
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dve($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != dma.a.a ? a($$2, dur.k, dve::a) : null;
      }
   }

   public static boolean a(dha $$0) {
      return $$0.G_().j() && $$0.V();
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if (a($$1)) {
         if ($$0.c(c) != dma.a.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a(
                  (double)($$2.u() + $$1.A.a(-16, 16)),
                  (double)($$2.v() + $$1.A.a(-14, 2)),
                  (double)($$2.w() + $$1.A.a(-16, 16)),
                  axf.gz,
                  axg.e,
                  1.0F,
                  1.0F,
                  false
               );
            }
         }
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      dxn $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      return c($$8, $$1, $$3);
   }

   private static dxn c(dxn $$0, dhd $$1, jh $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      dma.a $$4 = $$0.c(c);
      return $$3 && $$4 == dma.a.a ? $$0.b(c, dma.a.b) : $$0;
   }

   public static boolean b(dxn $$0, dhd $$1, jh $$2) {
      jm.a $$3 = $$0.c(b);

      for (jm $$4 : $$3.g()) {
         dxn $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(axu.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dhb $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         jh $$3 = $$1.a($$2);
         dxn $$4 = $$0.a_($$3);
         if (!$$4.a(axu.u)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      return c(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return dqt.b($$0, $$1);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if ($$1.c_($$2) instanceof dve $$5) {
         $$5.a(null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dxn a(dha $$0, jh $$1, dxn $$2, cps $$3) {
      if ($$0.c_($$1) instanceof dve $$4) {
         $$4.a($$3.dW().a($$3));
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static enum a implements bba {
      a("disabled"),
      b("dormant"),
      c("active");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
