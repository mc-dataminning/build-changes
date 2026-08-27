import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dmv extends dcf {
   public static final MapCodec<dmv> b = b(dmv::new);
   public static final dnz<dod> c = dnr.bg;
   public static final dns d = dnr.x;
   public static final float e = 4.0F;
   protected static final eqm f = dac.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eqm g = dac.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eqm h = dac.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eqm i = dac.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eqm j = dac.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eqm k = dac.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final eqm o = dac.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eqm F = dac.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eqm G = dac.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eqm H = dac.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eqm I = dac.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eqm J = dac.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eqm K = dac.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eqm L = dac.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eqm M = dac.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eqm N = dac.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eqm O = dac.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eqm P = dac.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eqm[] Q = a(true);
   private static final eqm[] R = a(false);

   @Override
   protected MapCodec<dmv> a() {
      return b;
   }

   private static eqm[] a(boolean $$0) {
      return Arrays.stream(ih.values()).map($$1 -> a($$1, $$0)).toArray(eqm[]::new);
   }

   private static eqm a(ih $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return eqj.a(k, $$1 ? L : F);
         case b:
            return eqj.a(j, $$1 ? K : o);
         case c:
            return eqj.a(i, $$1 ? N : H);
         case d:
            return eqj.a(h, $$1 ? M : G);
         case e:
            return eqj.a(g, $$1 ? P : J);
         case f:
            return eqj.a(f, $$1 ? O : I);
      }
   }

   public dmv(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.c).a(c, dod.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dnb $$0) {
      return true;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dnb $$0, dnb $$1) {
      dac $$2 = $$0.c(c) == dod.a ? dae.by : dae.br;
      return $$1.a($$2) && $$1.c(dmu.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dnb a(cxb $$0, ib $$1, dnb $$2, ciu $$3) {
      if (!$$0.B && $$3.ga().d) {
         ib $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ib $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      dnb $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dae.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if ($$0.a((cxe)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return new cqm($$2.c(c) == dod.b ? dae.br : dae.by);
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
