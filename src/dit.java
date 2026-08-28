import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dit extends dek {
   public static final MapCodec<dit> a = b(dit::new);
   public static final dsv b = dsr.Q;
   public static final dss c = dsr.f;
   private static final ewj d = dey.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewj e = dey.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ewj f = ewg.a(e, d);
   private static final ewj g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final ewj h = ewg.a(f, g, evu.e);
   private static final ewj i = ewg.a(h, dey.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ewj j = ewg.a(h, dey.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ewj k = ewg.a(h, dey.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ewj l = ewg.a(h, dey.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ewj m = ewg.a(h, dey.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ewj n = g;
   private static final ewj o = ewg.a(g, dey.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ewj F = ewg.a(g, dey.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ewj G = ewg.a(g, dey.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ewj H = ewg.a(g, dey.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   public dit(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
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
   protected ewj a(dsb $$0, dbd $$1, iz $$2) {
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
   public dsb a(cxz $$0) {
      je $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == je.a.b ? je.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return $$0.B ? null : a($$2, dpi.r, dqf::a);
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         dpg $$5 = $$1.c_($$2);
         if ($$5 instanceof dqf) {
            $$3.a((dqf)$$5);
            $$3.a(awj.ad);
         }

         return bqt.c;
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dbx $$0, iz $$1, dsb $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      bqp.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return cpt.a($$1.c_($$2));
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      dpg $$4 = $$1.c_($$2);
      if ($$4 instanceof dqf) {
         dqf.a($$1, $$2, $$0, $$3, (dqf)$$4);
      }
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
