import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daj extends cwb {
   public static final MapCodec<daj> a = b(daj::new);
   public static final dka b = djw.Q;
   public static final djx c = djw.f;
   private static final eml d = cwp.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eml e = cwp.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eml f = emi.a(e, d);
   private static final eml g = emi.a(f, dhs.y_, elw.e);
   private static final eml h = emi.a(g, cwp.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eml i = emi.a(g, cwp.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eml j = emi.a(g, cwp.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eml k = emi.a(g, cwp.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eml l = emi.a(g, cwp.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eml m = dhs.y_;
   private static final eml n = emi.a(dhs.y_, cwp.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eml o = emi.a(dhs.y_, cwp.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eml F = emi.a(dhs.y_, cwp.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eml G = emi.a(dhs.y_, cwp.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<daj> a() {
      return a;
   }

   public daj(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
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
   public eml a(djg $$0, csu $$1, hx $$2) {
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
            return dhs.y_;
      }
   }

   @Override
   public djg a(cpg $$0) {
      ic $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ic.a.b ? ic.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dht($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return $$0.B ? null : a($$2, dgw.r, dht::a);
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      if ($$4.A()) {
         dgu $$5 = $$0.c_($$1);
         if ($$5 instanceof dht) {
            ((dht)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         dgu $$6 = $$1.c_($$2);
         if ($$6 instanceof dht) {
            $$3.a((dht)$$6);
            $$3.a(asb.ad);
         }

         return bka.b;
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cto $$0, hx $$1, djg $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      bjw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return cia.a($$1.c_($$2));
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      dgu $$4 = $$1.c_($$2);
      if ($$4 instanceof dht) {
         dht.a($$1, $$2, $$0, $$3, (dht)$$4);
      }
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
