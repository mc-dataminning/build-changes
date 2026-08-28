import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dja extends der {
   public static final MapCodec<dja> a = b(dja::new);
   public static final dtb b = dsx.Q;
   public static final dsy c = dsx.f;
   private static final ews d = dff.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ews e = dff.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ews f = ewp.a(e, d);
   private static final ews g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final ews h = ewp.a(f, g, ewd.e);
   private static final ews i = ewp.a(h, dff.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ews j = ewp.a(h, dff.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ews k = ewp.a(h, dff.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ews l = ewp.a(h, dff.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ews m = ewp.a(h, dff.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ews n = g;
   private static final ews o = ewp.a(g, dff.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ews F = ewp.a(g, dff.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ews G = ewp.a(g, dff.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ews H = ewp.a(g, dff.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   public dja(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      switch ((jf)$$0.c(b)) {
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
   protected ews a(dsh $$0, dbj $$1, ja $$2) {
      switch ((jf)$$0.c(b)) {
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
   public dsh a(cxk $$0) {
      jf $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == jf.a.b ? jf.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return $$0.B ? null : a($$2, dpp.r, dqm::a);
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         dpn $$5 = $$1.c_($$2);
         if ($$5 instanceof dqm) {
            $$3.a((dqm)$$5);
            $$3.a(avp.ad);
         }

         return bqd.c;
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dcd $$0, ja $$1, dsh $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      bpz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return cpe.a($$1.c_($$2));
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      dpn $$4 = $$1.c_($$2);
      if ($$4 instanceof dqm) {
         dqm.a($$1, $$2, $$0, $$3, (dqm)$$4);
      }
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
