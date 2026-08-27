import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dij extends cyc {
   public static final MapCodec<dij> b = b(dij::new);
   public static final djn<djr> c = djf.bg;
   public static final djg d = djf.x;
   public static final float e = 4.0F;
   protected static final elu f = cvz.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final elu g = cvz.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final elu h = cvz.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final elu i = cvz.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final elu j = cvz.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final elu k = cvz.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final elu o = cvz.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final elu F = cvz.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final elu G = cvz.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final elu H = cvz.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final elu I = cvz.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final elu J = cvz.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final elu K = cvz.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final elu L = cvz.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final elu M = cvz.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final elu N = cvz.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final elu O = cvz.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final elu P = cvz.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final elu[] Q = a(true);
   private static final elu[] R = a(false);

   @Override
   protected MapCodec<dij> a() {
      return b;
   }

   private static elu[] a(boolean $$0) {
      return Arrays.stream(ia.values()).map($$1 -> a($$1, $$0)).toArray(elu[]::new);
   }

   private static elu a(ia $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return elr.a(k, $$1 ? L : F);
         case b:
            return elr.a(j, $$1 ? K : o);
         case c:
            return elr.a(i, $$1 ? N : H);
         case d:
            return elr.a(h, $$1 ? M : G);
         case e:
            return elr.a(g, $$1 ? P : J);
         case f:
            return elr.a(f, $$1 ? O : I);
      }
   }

   public dij(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ia.c).a(c, djr.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dip $$0) {
      return true;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dip $$0, dip $$1) {
      cvz $$2 = $$0.c(c) == djr.a ? cwb.by : cwb.br;
      return $$1.a($$2) && $$1.c(dii.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dip a(csy $$0, hv $$1, dip $$2, cer $$3) {
      if (!$$0.B && $$3.fT().d) {
         hv $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         hv $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      dip $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cwb.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if ($$0.a((ctb)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh($$2.c(c) == djr.b ? cwb.br : cwb.by);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
