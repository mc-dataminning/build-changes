import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dqb extends dfh {
   public static final MapCodec<dqb> b = b(dqb::new);
   public static final drf<drj> c = dqx.bg;
   public static final dqy d = dqx.x;
   public static final float e = 4.0F;
   protected static final eui f = dde.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eui g = dde.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eui h = dde.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eui i = dde.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eui j = dde.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eui k = dde.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final eui o = dde.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eui F = dde.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eui G = dde.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eui H = dde.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eui I = dde.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eui J = dde.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eui K = dde.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eui L = dde.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eui M = dde.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eui N = dde.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eui O = dde.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eui P = dde.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eui[] Q = a(true);
   private static final eui[] R = a(false);

   @Override
   protected MapCodec<dqb> a() {
      return b;
   }

   private static eui[] a(boolean $$0) {
      return Arrays.stream(is.values()).map($$1 -> a($$1, $$0)).toArray(eui[]::new);
   }

   private static eui a(is $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return euf.a(k, $$1 ? L : F);
         case b:
            return euf.a(j, $$1 ? K : o);
         case c:
            return euf.a(i, $$1 ? N : H);
         case d:
            return euf.a(h, $$1 ? M : G);
         case e:
            return euf.a(g, $$1 ? P : J);
         case f:
            return euf.a(f, $$1 ? O : I);
      }
   }

   public dqb(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, is.c).a(c, drj.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dqh $$0) {
      return true;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dqh $$0, dqh $$1) {
      dde $$2 = $$0.c(c) == drj.a ? ddg.by : ddg.br;
      return $$1.a($$2) && $$1.c(dqa.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dqh a(dad $$0, in $$1, dqh $$2, clh $$3) {
      if (!$$0.B && $$3.gb().d) {
         in $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         in $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      dqh $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(ddg.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if ($$0.a((dag)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz($$2.c(c) == drj.b ? ddg.br : ddg.by);
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
