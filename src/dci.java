import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dci extends cya {
   public static final MapCodec<dci> a = b(dci::new);
   public static final dlz b = dlv.Q;
   public static final dlw c = dlv.f;
   private static final eol d = cyo.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eol e = cyo.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eol f = eoi.a(e, d);
   private static final eol g = eoi.a(f, djr.z_, enw.e);
   private static final eol h = eoi.a(g, cyo.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eol i = eoi.a(g, cyo.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eol j = eoi.a(g, cyo.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eol k = eoi.a(g, cyo.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eol l = eoi.a(g, cyo.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eol m = djr.z_;
   private static final eol n = eoi.a(djr.z_, cyo.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eol o = eoi.a(djr.z_, cyo.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eol F = eoi.a(djr.z_, cyo.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eol G = eoi.a(djr.z_, cyo.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dci> a() {
      return a;
   }

   public dci(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      switch ((ie)$$0.c(b)) {
         case a:
            return h;
         case c:
            return j;
         case d:
            return k;
         case e:
            return l;
         case f:
            return i;
         default:
            return g;
      }
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2) {
      switch ((ie)$$0.c(b)) {
         case a:
            return m;
         case c:
            return o;
         case d:
            return F;
         case e:
            return G;
         case f:
            return n;
         default:
            return djr.z_;
      }
   }

   @Override
   public dlf a(crg $$0) {
      ie $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ie.a.b ? ie.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return $$0.B ? null : a($$2, div.r, djs::a);
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      if ($$4.B()) {
         dit $$5 = $$0.c_($$1);
         if ($$5 instanceof djs) {
            ((djs)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         dit $$5 = $$1.c_($$2);
         if ($$5 instanceof djs) {
            $$3.a((djs)$$5);
            $$3.a(atu.ad);
         }

         return blu.b;
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cvn $$0, hz $$1, dlf $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      blq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return ckb.a($$1.c_($$2));
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      dit $$4 = $$1.c_($$2);
      if ($$4 instanceof djs) {
         djs.a($$1, $$2, $$0, $$3, (djs)$$4);
      }
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
