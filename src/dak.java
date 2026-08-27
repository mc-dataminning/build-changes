import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dak extends cwc {
   public static final MapCodec<dak> a = b(dak::new);
   public static final dkb b = djx.Q;
   public static final djy c = djx.f;
   private static final emm d = cwq.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final emm e = cwq.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final emm f = emj.a(e, d);
   private static final emm g = emj.a(f, dht.y_, elx.e);
   private static final emm h = emj.a(g, cwq.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final emm i = emj.a(g, cwq.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final emm j = emj.a(g, cwq.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final emm k = emj.a(g, cwq.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final emm l = emj.a(g, cwq.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final emm m = dht.y_;
   private static final emm n = emj.a(dht.y_, cwq.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final emm o = emj.a(dht.y_, cwq.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final emm F = emj.a(dht.y_, cwq.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final emm G = emj.a(dht.y_, cwq.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dak> a() {
      return a;
   }

   public dak(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      switch ((ic)$$0.c(b)) {
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
   public emm a(djh $$0, csv $$1, hx $$2) {
      switch ((ic)$$0.c(b)) {
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
            return dht.y_;
      }
   }

   @Override
   public djh a(cph $$0) {
      ic $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ic.a.b ? ic.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return $$0.B ? null : a($$2, dgx.r, dhu::a);
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      if ($$4.A()) {
         dgv $$5 = $$0.c_($$1);
         if ($$5 instanceof dhu) {
            ((dhu)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         dgv $$6 = $$1.c_($$2);
         if ($$6 instanceof dhu) {
            $$3.a((dhu)$$6);
            $$3.a(asc.ad);
         }

         return bkb.b;
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(ctp $$0, hx $$1, djh $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      bjx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return cib.a($$1.c_($$2));
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      dgv $$4 = $$1.c_($$2);
      if ($$4 instanceof dhu) {
         dhu.a($$1, $$2, $$0, $$3, (dhu)$$4);
      }
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
