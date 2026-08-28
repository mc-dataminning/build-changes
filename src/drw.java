import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class drw extends dhc {
   public static final MapCodec<drw> b = b(drw::new);
   public static final dta<dte> c = dss.bg;
   public static final dst d = dss.x;
   public static final float e = 4.0F;
   protected static final ewk f = dez.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewk g = dez.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ewk h = dez.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ewk i = dez.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ewk j = dez.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewk k = dez.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ewk o = dez.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewk F = dez.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ewk G = dez.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ewk H = dez.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ewk I = dez.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewk J = dez.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ewk K = dez.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewk L = dez.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewk M = dez.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ewk N = dez.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ewk O = dez.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewk P = dez.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ewk[] Q = a(true);
   private static final ewk[] R = a(false);

   @Override
   protected MapCodec<drw> a() {
      return b;
   }

   private static ewk[] a(boolean $$0) {
      return Arrays.stream(je.values()).map($$1 -> a($$1, $$0)).toArray(ewk[]::new);
   }

   private static ewk a(je $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ewh.a(k, $$1 ? L : F);
         case b:
            return ewh.a(j, $$1 ? K : o);
         case c:
            return ewh.a(i, $$1 ? N : H);
         case d:
            return ewh.a(h, $$1 ? M : G);
         case e:
            return ewh.a(g, $$1 ? P : J);
         case f:
            return ewh.a(f, $$1 ? O : I);
      }
   }

   public drw(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.c).a(c, dte.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsc $$0) {
      return true;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dsc $$0, dsc $$1) {
      dez $$2 = $$0.c(c) == dte.a ? dfb.by : dfb.br;
      return $$1.a($$2) && $$1.c(drv.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dsc a(dby $$0, iz $$1, dsc $$2, cmx $$3) {
      if (!$$0.B && $$3.gd().d) {
         iz $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         iz $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      dsc $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dfb.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      if ($$0.a((dcb)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup($$2.c(c) == dte.b ? dfb.br : dfb.by);
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
