import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czt extends cvl {
   public static final MapCodec<czt> a = b(czt::new);
   public static final djj b = djf.Q;
   public static final djg c = djf.f;
   private static final elu d = cvz.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final elu e = cvz.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final elu f = elr.a(e, d);
   private static final elu g = elr.a(f, dhb.x_, elf.e);
   private static final elu h = elr.a(g, cvz.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final elu i = elr.a(g, cvz.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final elu j = elr.a(g, cvz.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final elu k = elr.a(g, cvz.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final elu l = elr.a(g, cvz.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final elu m = dhb.x_;
   private static final elu n = elr.a(dhb.x_, cvz.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final elu o = elr.a(dhb.x_, cvz.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final elu F = elr.a(dhb.x_, cvz.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final elu G = elr.a(dhb.x_, cvz.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<czt> a() {
      return a;
   }

   public czt(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      switch ((ia)$$0.c(b)) {
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
   public elu a(dip $$0, cse $$1, hv $$2) {
      switch ((ia)$$0.c(b)) {
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
            return dhb.x_;
      }
   }

   @Override
   public dip a(coq $$0) {
      ia $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ia.a.b ? ia.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return $$0.B ? null : a($$2, dgf.r, dhc::a);
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      if ($$4.A()) {
         dgd $$5 = $$0.c_($$1);
         if ($$5 instanceof dhc) {
            ((dhc)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         dgd $$6 = $$1.c_($$2);
         if ($$6 instanceof dhc) {
            $$3.a((dhc)$$6);
            $$3.a(arm.ad);
         }

         return bjl.b;
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(csy $$0, hv $$1, dip $$2) {
      boolean $$3 = !$$0.B($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      bjh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return chk.a($$1.c_($$2));
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      dgd $$4 = $$1.c_($$2);
      if ($$4 instanceof dhc) {
         dhc.a($$1, $$2, $$0, $$3, (dhc)$$4);
      }
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
