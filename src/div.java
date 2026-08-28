import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class div extends dem {
   public static final MapCodec<div> a = b(div::new);
   public static final dsx b = dst.Q;
   public static final dsu c = dst.f;
   private static final ewl d = dfa.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewl e = dfa.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ewl f = ewi.a(e, d);
   private static final ewl g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final ewl h = ewi.a(f, g, evw.e);
   private static final ewl i = ewi.a(h, dfa.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ewl j = ewi.a(h, dfa.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ewl k = ewi.a(h, dfa.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ewl l = ewi.a(h, dfa.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ewl m = ewi.a(h, dfa.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ewl n = g;
   private static final ewl o = ewi.a(g, dfa.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ewl F = ewi.a(g, dfa.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ewl G = ewi.a(g, dfa.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ewl H = ewi.a(g, dfa.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<div> a() {
      return a;
   }

   public div(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      switch ((je)$$0.c(b)) {
         case a:
            return i;
         case c:
            return k;
         case d:
            return l;
         case e:
            return m;
         case f:
            return j;
         default:
            return h;
      }
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2) {
      switch ((je)$$0.c(b)) {
         case a:
            return n;
         case c:
            return F;
         case d:
            return G;
         case e:
            return H;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public dsd a(cyb $$0) {
      je $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == je.a.b ? je.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return $$0.B ? null : a($$2, dpk.r, dqh::a);
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         dpi $$5 = $$1.c_($$2);
         if ($$5 instanceof dqh) {
            $$3.a((dqh)$$5);
            $$3.a(awk.ad);
         }

         return bqv.c;
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dbz $$0, iz $$1, dsd $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      bqr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return cpv.a($$1.c_($$2));
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      dpi $$4 = $$1.c_($$2);
      if ($$4 instanceof dqh) {
         dqh.a($$1, $$2, $$0, $$3, (dqh)$$4);
      }
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
