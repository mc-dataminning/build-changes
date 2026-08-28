import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class drv extends dhb {
   public static final MapCodec<drv> b = b(drv::new);
   public static final dsz<dtd> c = dsr.bg;
   public static final dss d = dsr.x;
   public static final float e = 4.0F;
   protected static final ewj f = dey.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewj g = dey.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ewj h = dey.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ewj i = dey.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ewj j = dey.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewj k = dey.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ewj o = dey.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewj F = dey.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ewj G = dey.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ewj H = dey.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ewj I = dey.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewj J = dey.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ewj K = dey.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewj L = dey.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewj M = dey.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ewj N = dey.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ewj O = dey.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewj P = dey.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ewj[] Q = a(true);
   private static final ewj[] R = a(false);

   @Override
   protected MapCodec<drv> a() {
      return b;
   }

   private static ewj[] a(boolean $$0) {
      return Arrays.stream(je.values()).map($$1 -> a($$1, $$0)).toArray(ewj[]::new);
   }

   private static ewj a(je $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ewg.a(k, $$1 ? L : F);
         case b:
            return ewg.a(j, $$1 ? K : o);
         case c:
            return ewg.a(i, $$1 ? N : H);
         case d:
            return ewg.a(h, $$1 ? M : G);
         case e:
            return ewg.a(g, $$1 ? P : J);
         case f:
            return ewg.a(f, $$1 ? O : I);
      }
   }

   public drv(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.c).a(c, dtd.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsb $$0) {
      return true;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dsb $$0, dsb $$1) {
      dey $$2 = $$0.c(c) == dtd.a ? dfa.by : dfa.br;
      return $$1.a($$2) && $$1.c(dru.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dsb a(dbx $$0, iz $$1, dsb $$2, cmw $$3) {
      if (!$$0.B && $$3.gd().d) {
         iz $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         iz $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      dsb $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dfa.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if ($$0.a((dca)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return new cuo($$2.c(c) == dtd.b ? dfa.br : dfa.by);
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
