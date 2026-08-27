import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dja extends cys {
   public static final MapCodec<dja> b = b(dja::new);
   public static final dke<dki> c = djw.bg;
   public static final djx d = djw.x;
   public static final float e = 4.0F;
   protected static final eml f = cwp.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eml g = cwp.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eml h = cwp.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eml i = cwp.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eml j = cwp.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eml k = cwp.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final eml o = cwp.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eml F = cwp.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eml G = cwp.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eml H = cwp.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eml I = cwp.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eml J = cwp.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eml K = cwp.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eml L = cwp.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eml M = cwp.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eml N = cwp.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eml O = cwp.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eml P = cwp.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eml[] Q = a(true);
   private static final eml[] R = a(false);

   @Override
   protected MapCodec<dja> a() {
      return b;
   }

   private static eml[] a(boolean $$0) {
      return Arrays.stream(ic.values()).map($$1 -> a($$1, $$0)).toArray(eml[]::new);
   }

   private static eml a(ic $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return emi.a(k, $$1 ? L : F);
         case b:
            return emi.a(j, $$1 ? K : o);
         case c:
            return emi.a(i, $$1 ? N : H);
         case d:
            return emi.a(h, $$1 ? M : G);
         case e:
            return emi.a(g, $$1 ? P : J);
         case f:
            return emi.a(f, $$1 ? O : I);
      }
   }

   public dja(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.c).a(c, dki.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(djg $$0) {
      return true;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(djg $$0, djg $$1) {
      cwp $$2 = $$0.c(c) == dki.a ? cwr.by : cwr.br;
      return $$1.a($$2) && $$1.c(diz.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public djg a(cto $$0, hx $$1, djg $$2, cfh $$3) {
      if (!$$0.B && $$3.fT().d) {
         hx $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         hx $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      djg $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cwr.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      if ($$0.a((ctr)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx($$2.c(c) == dki.b ? cwr.br : cwr.by);
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
