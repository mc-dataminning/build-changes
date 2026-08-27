import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class das extends cwk {
   public static final MapCodec<das> a = b(das::new);
   public static final dkj b = dkf.Q;
   public static final dkg c = dkf.f;
   private static final emv d = cwy.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final emv e = cwy.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final emv f = ems.a(e, d);
   private static final emv g = ems.a(f, dib.z_, emg.e);
   private static final emv h = ems.a(g, cwy.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final emv i = ems.a(g, cwy.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final emv j = ems.a(g, cwy.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final emv k = ems.a(g, cwy.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final emv l = ems.a(g, cwy.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final emv m = dib.z_;
   private static final emv n = ems.a(dib.z_, cwy.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final emv o = ems.a(dib.z_, cwy.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final emv F = ems.a(dib.z_, cwy.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final emv G = ems.a(dib.z_, cwy.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<das> a() {
      return a;
   }

   public das(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
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
   public emv a(djp $$0, ctd $$1, hx $$2) {
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
            return dib.z_;
      }
   }

   @Override
   public djp a(cpp $$0) {
      ic $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ic.a.b ? ic.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dic($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return $$0.B ? null : a($$2, dhf.r, dic::a);
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if ($$4.A()) {
         dhd $$5 = $$0.c_($$1);
         if ($$5 instanceof dic) {
            ((dic)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         dhd $$5 = $$1.c_($$2);
         if ($$5 instanceof dic) {
            $$3.a((dic)$$5);
            $$3.a(asd.ad);
         }

         return bkc.b;
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(ctx $$0, hx $$1, djp $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      bjy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return cij.a($$1.c_($$2));
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      dhd $$4 = $$1.c_($$2);
      if ($$4 instanceof dic) {
         dic.a($$1, $$2, $$0, $$3, (dic)$$4);
      }
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
