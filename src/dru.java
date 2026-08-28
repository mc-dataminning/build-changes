import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dru extends dha {
   public static final MapCodec<dru> b = b(dru::new);
   public static final dsy<dtc> c = dsq.bg;
   public static final dsr d = dsq.x;
   public static final float e = 4.0F;
   protected static final ewi f = dex.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewi g = dex.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ewi h = dex.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ewi i = dex.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ewi j = dex.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewi k = dex.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ewi o = dex.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewi F = dex.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ewi G = dex.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ewi H = dex.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ewi I = dex.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewi J = dex.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ewi K = dex.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewi L = dex.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewi M = dex.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ewi N = dex.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ewi O = dex.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewi P = dex.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ewi[] Q = a(true);
   private static final ewi[] R = a(false);

   @Override
   protected MapCodec<dru> a() {
      return b;
   }

   private static ewi[] a(boolean $$0) {
      return Arrays.stream(je.values()).map($$1 -> a($$1, $$0)).toArray(ewi[]::new);
   }

   private static ewi a(je $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ewf.a(k, $$1 ? L : F);
         case b:
            return ewf.a(j, $$1 ? K : o);
         case c:
            return ewf.a(i, $$1 ? N : H);
         case d:
            return ewf.a(h, $$1 ? M : G);
         case e:
            return ewf.a(g, $$1 ? P : J);
         case f:
            return ewf.a(f, $$1 ? O : I);
      }
   }

   public dru(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.c).a(c, dtc.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsa $$0) {
      return true;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dsa $$0, dsa $$1) {
      dex $$2 = $$0.c(c) == dtc.a ? dez.by : dez.br;
      return $$1.a($$2) && $$1.c(drt.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dsa a(dbw $$0, iz $$1, dsa $$2, cmv $$3) {
      if (!$$0.B && $$3.gd().d) {
         iz $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         iz $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      dsa $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dez.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      if ($$0.a((dbz)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return new cun($$2.c(c) == dtc.b ? dez.br : dez.by);
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
