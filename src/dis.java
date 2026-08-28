import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dis extends dej {
   public static final MapCodec<dis> a = b(dis::new);
   public static final dsu b = dsq.Q;
   public static final dsr c = dsq.f;
   private static final ewi d = dex.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewi e = dex.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ewi f = ewf.a(e, d);
   private static final ewi g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final ewi h = ewf.a(f, g, evt.e);
   private static final ewi i = ewf.a(h, dex.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ewi j = ewf.a(h, dex.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ewi k = ewf.a(h, dex.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ewi l = ewf.a(h, dex.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ewi m = ewf.a(h, dex.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ewi n = g;
   private static final ewi o = ewf.a(g, dex.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ewi F = ewf.a(g, dex.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ewi G = ewf.a(g, dex.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ewi H = ewf.a(g, dex.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   public dis(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
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
   protected ewi a(dsa $$0, dbc $$1, iz $$2) {
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
   public dsa a(cxy $$0) {
      je $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == je.a.b ? je.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return $$0.B ? null : a($$2, dph.r, dqe::a);
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         dpf $$5 = $$1.c_($$2);
         if ($$5 instanceof dqe) {
            $$3.a((dqe)$$5);
            $$3.a(awj.ad);
         }

         return bqs.c;
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dbw $$0, iz $$1, dsa $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      bqo.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return cps.a($$1.c_($$2));
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      dpf $$4 = $$1.c_($$2);
      if ($$4 instanceof dqe) {
         dqe.a($$1, $$2, $$0, $$3, (dqe)$$4);
      }
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
