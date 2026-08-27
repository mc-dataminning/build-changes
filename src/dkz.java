import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dkz extends dar {
   public static final MapCodec<dkz> b = b(dkz::new);
   public static final dmd<dmh> c = dlv.bg;
   public static final dlw d = dlv.x;
   public static final float e = 4.0F;
   protected static final eol f = cyo.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eol g = cyo.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eol h = cyo.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eol i = cyo.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eol j = cyo.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eol k = cyo.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final eol o = cyo.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eol F = cyo.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eol G = cyo.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eol H = cyo.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eol I = cyo.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eol J = cyo.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eol K = cyo.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eol L = cyo.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eol M = cyo.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eol N = cyo.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eol O = cyo.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eol P = cyo.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eol[] Q = a(true);
   private static final eol[] R = a(false);

   @Override
   protected MapCodec<dkz> a() {
      return b;
   }

   private static eol[] a(boolean $$0) {
      return Arrays.stream(ie.values()).map($$1 -> a($$1, $$0)).toArray(eol[]::new);
   }

   private static eol a(ie $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return eoi.a(k, $$1 ? L : F);
         case b:
            return eoi.a(j, $$1 ? K : o);
         case c:
            return eoi.a(i, $$1 ? N : H);
         case d:
            return eoi.a(h, $$1 ? M : G);
         case e:
            return eoi.a(g, $$1 ? P : J);
         case f:
            return eoi.a(f, $$1 ? O : I);
      }
   }

   public dkz(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ie.c).a(c, dmh.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dlf $$0) {
      return true;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dlf $$0, dlf $$1) {
      cyo $$2 = $$0.c(c) == dmh.a ? cyq.by : cyq.br;
      return $$1.a($$2) && $$1.c(dky.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dlf a(cvn $$0, hz $$1, dlf $$2, chh $$3) {
      if (!$$0.B && $$3.fU().d) {
         hz $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         hz $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      dlf $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cyq.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if ($$0.a((cvq)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return new coz($$2.c(c) == dmh.b ? cyq.br : cyq.by);
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
