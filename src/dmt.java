import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dmt extends dcd {
   public static final MapCodec<dmt> b = b(dmt::new);
   public static final dnx<dob> c = dnp.bg;
   public static final dnq d = dnp.x;
   public static final float e = 4.0F;
   protected static final eqk f = daa.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eqk g = daa.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eqk h = daa.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eqk i = daa.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eqk j = daa.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eqk k = daa.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final eqk o = daa.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eqk F = daa.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eqk G = daa.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eqk H = daa.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eqk I = daa.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eqk J = daa.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eqk K = daa.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eqk L = daa.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eqk M = daa.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eqk N = daa.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eqk O = daa.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eqk P = daa.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eqk[] Q = a(true);
   private static final eqk[] R = a(false);

   @Override
   protected MapCodec<dmt> a() {
      return b;
   }

   private static eqk[] a(boolean $$0) {
      return Arrays.stream(ih.values()).map($$1 -> a($$1, $$0)).toArray(eqk[]::new);
   }

   private static eqk a(ih $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return eqh.a(k, $$1 ? L : F);
         case b:
            return eqh.a(j, $$1 ? K : o);
         case c:
            return eqh.a(i, $$1 ? N : H);
         case d:
            return eqh.a(h, $$1 ? M : G);
         case e:
            return eqh.a(g, $$1 ? P : J);
         case f:
            return eqh.a(f, $$1 ? O : I);
      }
   }

   public dmt(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.c).a(c, dob.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dmz $$0) {
      return true;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dmz $$0, dmz $$1) {
      daa $$2 = $$0.c(c) == dob.a ? dac.by : dac.br;
      return $$1.a($$2) && $$1.c(dms.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dmz a(cwz $$0, ib $$1, dmz $$2, cis $$3) {
      if (!$$0.B && $$3.ga().d) {
         ib $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ib $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      dmz $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dac.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if ($$0.a((cxc)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return new cqk($$2.c(c) == dob.b ? dac.br : dac.by);
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
