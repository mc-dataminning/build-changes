import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class drx extends dhd {
   public static final MapCodec<drx> b = b(drx::new);
   public static final dtb<dtf> c = dst.bg;
   public static final dsu d = dst.x;
   public static final float e = 4.0F;
   protected static final ewl f = dfa.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewl g = dfa.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ewl h = dfa.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ewl i = dfa.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ewl j = dfa.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewl k = dfa.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ewl o = dfa.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewl F = dfa.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ewl G = dfa.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ewl H = dfa.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ewl I = dfa.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewl J = dfa.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ewl K = dfa.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ewl L = dfa.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewl M = dfa.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ewl N = dfa.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ewl O = dfa.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ewl P = dfa.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ewl[] Q = a(true);
   private static final ewl[] R = a(false);

   @Override
   protected MapCodec<drx> a() {
      return b;
   }

   private static ewl[] a(boolean $$0) {
      return Arrays.stream(je.values()).map($$1 -> a($$1, $$0)).toArray(ewl[]::new);
   }

   private static ewl a(je $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ewi.a(k, $$1 ? L : F);
         case b:
            return ewi.a(j, $$1 ? K : o);
         case c:
            return ewi.a(i, $$1 ? N : H);
         case d:
            return ewi.a(h, $$1 ? M : G);
         case e:
            return ewi.a(g, $$1 ? P : J);
         case f:
            return ewi.a(f, $$1 ? O : I);
      }
   }

   public drx(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.c).a(c, dtf.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsd $$0) {
      return true;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dsd $$0, dsd $$1) {
      dfa $$2 = $$0.c(c) == dtf.a ? dfc.by : dfc.br;
      return $$1.a($$2) && $$1.c(drw.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dsd a(dbz $$0, iz $$1, dsd $$2, cmy $$3) {
      if (!$$0.B && $$3.gd().d) {
         iz $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         iz $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      dsd $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dfc.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      if ($$0.a((dcc)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return new cuq($$2.c(c) == dtf.b ? dfc.br : dfc.by);
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
