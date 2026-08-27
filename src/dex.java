import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dex extends cvd {
   public static final MapCodec<dex> b = b(dex::new);
   public static final dgb<dgf> c = dft.bg;
   public static final dfu d = dft.x;
   public static final float e = 4.0F;
   protected static final eia f = ctc.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eia g = ctc.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eia h = ctc.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eia i = ctc.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eia j = ctc.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eia k = ctc.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final eia o = ctc.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eia F = ctc.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eia G = ctc.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eia H = ctc.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eia I = ctc.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eia J = ctc.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eia K = ctc.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eia L = ctc.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eia M = ctc.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eia N = ctc.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eia O = ctc.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eia P = ctc.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eia[] Q = a(true);
   private static final eia[] R = a(false);

   @Override
   protected MapCodec<dex> a() {
      return b;
   }

   private static eia[] a(boolean $$0) {
      return Arrays.stream(ha.values()).map($$1 -> a($$1, $$0)).toArray(eia[]::new);
   }

   private static eia a(ha $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ehx.a(k, $$1 ? L : F);
         case b:
            return ehx.a(j, $$1 ? K : o);
         case c:
            return ehx.a(i, $$1 ? N : H);
         case d:
            return ehx.a(h, $$1 ? M : G);
         case e:
            return ehx.a(g, $$1 ? P : J);
         case f:
            return ehx.a(f, $$1 ? O : I);
      }
   }

   public dex(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ha.c).a(c, dgf.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfd $$0) {
      return true;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dfd $$0, dfd $$1) {
      ctc $$2 = $$0.c(c) == dgf.a ? cte.by : cte.br;
      return $$1.a($$2) && $$1.c(dew.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dfd a(cqb $$0, gw $$1, dfd $$2, cca $$3) {
      if (!$$0.B && $$3.fT().d) {
         gw $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         gw $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      dfd $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cte.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if ($$0.a((cqe)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl($$2.c(c) == dgf.b ? cte.br : cte.by);
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
