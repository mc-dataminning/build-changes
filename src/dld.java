import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dld extends dav {
   public static final MapCodec<dld> b = b(dld::new);
   public static final dmh<dml> c = dlz.bg;
   public static final dma d = dlz.x;
   public static final float e = 4.0F;
   protected static final eos f = cys.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eos g = cys.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eos h = cys.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eos i = cys.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eos j = cys.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eos k = cys.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final eos o = cys.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eos F = cys.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eos G = cys.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eos H = cys.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eos I = cys.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eos J = cys.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eos K = cys.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eos L = cys.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eos M = cys.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eos N = cys.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eos O = cys.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eos P = cys.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eos[] Q = a(true);
   private static final eos[] R = a(false);

   @Override
   protected MapCodec<dld> a() {
      return b;
   }

   private static eos[] a(boolean $$0) {
      return Arrays.stream(ie.values()).map($$1 -> a($$1, $$0)).toArray(eos[]::new);
   }

   private static eos a(ie $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return eop.a(k, $$1 ? L : F);
         case b:
            return eop.a(j, $$1 ? K : o);
         case c:
            return eop.a(i, $$1 ? N : H);
         case d:
            return eop.a(h, $$1 ? M : G);
         case e:
            return eop.a(g, $$1 ? P : J);
         case f:
            return eop.a(f, $$1 ? O : I);
      }
   }

   public dld(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ie.c).a(c, dml.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dlj $$0) {
      return true;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dlj $$0, dlj $$1) {
      cys $$2 = $$0.c(c) == dml.a ? cyu.by : cyu.br;
      return $$1.a($$2) && $$1.c(dlc.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dlj a(cvr $$0, hz $$1, dlj $$2, chl $$3) {
      if (!$$0.B && $$3.fU().d) {
         hz $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         hz $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      dlj $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cyu.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if ($$0.a((cvu)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd($$2.c(c) == dml.b ? cyu.br : cyu.by);
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
