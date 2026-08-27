import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dad extends cvv {
   public static final MapCodec<dad> a = b(dad::new);
   public static final dju b = djq.Q;
   public static final djr c = djq.f;
   private static final emf d = cwj.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final emf e = cwj.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final emf f = emc.a(e, d);
   private static final emf g = emc.a(f, dhm.y_, elq.e);
   private static final emf h = emc.a(g, cwj.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final emf i = emc.a(g, cwj.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final emf j = emc.a(g, cwj.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final emf k = emc.a(g, cwj.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final emf l = emc.a(g, cwj.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final emf m = dhm.y_;
   private static final emf n = emc.a(dhm.y_, cwj.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final emf o = emc.a(dhm.y_, cwj.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final emf F = emc.a(dhm.y_, cwj.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final emf G = emc.a(dhm.y_, cwj.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dad> a() {
      return a;
   }

   public dad(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
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
   public emf a(dja $$0, cso $$1, hx $$2) {
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
            return dhm.y_;
      }
   }

   @Override
   public dja a(cpa $$0) {
      ic $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ic.a.b ? ic.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return $$0.B ? null : a($$2, dgq.r, dhn::a);
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if ($$4.A()) {
         dgo $$5 = $$0.c_($$1);
         if ($$5 instanceof dhn) {
            ((dhn)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         dgo $$6 = $$1.c_($$2);
         if ($$6 instanceof dhn) {
            $$3.a((dhn)$$6);
            $$3.a(arw.ad);
         }

         return bjv.b;
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cti $$0, hx $$1, dja $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      bjr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return chu.a($$1.c_($$2));
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      dgo $$4 = $$1.c_($$2);
      if ($$4 instanceof dhn) {
         dhn.a($$1, $$2, $$0, $$3, (dhn)$$4);
      }
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
