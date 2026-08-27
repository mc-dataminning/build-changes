import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddh extends cvz {
   public static final MapCodec<ddh> a = b(ddh::new);
   public static final int b = 8;
   public static final djp c = djf.aF;
   protected static final elu[] d = new elu[]{
      elr.a(),
      cvz.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   protected ddh(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      switch ($$3) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   public elu b_(dip $$0, cse $$1, hv $$2) {
      return d[$$0.c(c)];
   }

   @Override
   public elu c(dip $$0, cse $$1, hv $$2, elg $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public boolean g_(dip $$0) {
      return true;
   }

   @Override
   public float d(dip $$0, cse $$1, hv $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      dip $$3 = $$1.a_($$2.d());
      if ($$3.a(arr.cg)) {
         return false;
      } else {
         return $$3.a(arr.ch) ? true : cvz.a($$3.k($$1, $$2.d()), ia.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$1.a(cth.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ia.b : true;
      }
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c);
   }
}
