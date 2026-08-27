import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddu extends czm {
   public static final MapCodec<ddu> a = b(ddu::new);
   public static final dnt b = dnp.Q;
   public static final dnq c = dnp.f;
   private static final eqk d = daa.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqk e = daa.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eqk f = eqh.a(e, d);
   private static final eqk g = eqh.a(f, dle.w_, epv.e);
   private static final eqk h = eqh.a(g, daa.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eqk i = eqh.a(g, daa.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eqk j = eqh.a(g, daa.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eqk k = eqh.a(g, daa.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eqk l = eqh.a(g, daa.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eqk m = dle.w_;
   private static final eqk n = eqh.a(dle.w_, daa.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eqk o = eqh.a(dle.w_, daa.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eqk F = eqh.a(dle.w_, daa.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eqk G = eqh.a(dle.w_, daa.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public ddu(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      switch ((ih)$$0.c(b)) {
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
   protected eqk a(dmz $$0, cwf $$1, ib $$2) {
      switch ((ih)$$0.c(b)) {
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
            return dle.w_;
      }
   }

   @Override
   public dmz a(css $$0) {
      ih $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ih.a.b ? ih.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return $$0.B ? null : a($$2, dki.r, dlf::a);
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      if ($$4.B()) {
         dkg $$5 = $$0.c_($$1);
         if ($$5 instanceof dlf) {
            ((dlf)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         dkg $$5 = $$1.c_($$2);
         if ($$5 instanceof dlf) {
            $$3.a((dlf)$$5);
            $$3.a(aui.ad);
         }

         return bnc.b;
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cwz $$0, ib $$1, dmz $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      bmy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return clo.a($$1.c_($$2));
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      dkg $$4 = $$1.c_($$2);
      if ($$4 instanceof dlf) {
         dlf.a($$1, $$2, $$0, $$3, (dlf)$$4);
      }
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
