import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dci extends cva {
   public static final MapCodec<dci> a = b(dci::new);
   public static final int b = 8;
   public static final dii c = dhy.aF;
   protected static final ekn[] d = new ekn[]{
      ekk.a(),
      cva.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dci> a() {
      return a;
   }

   protected dci(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
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
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   public ekn b_(dhi $$0, crg $$1, ht $$2) {
      return d[$$0.c(c)];
   }

   @Override
   public ekn c(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public boolean g_(dhi $$0) {
      return true;
   }

   @Override
   public float d(dhi $$0, crg $$1, ht $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      dhi $$3 = $$1.a_($$2.d());
      if ($$3.a(arg.cg)) {
         return false;
      } else {
         return $$3.a(arg.ch) ? true : cva.a($$3.k($$1, $$2.d()), hx.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$1.a(csj.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dhi $$0, cnr $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == hx.b : true;
      }
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c);
   }
}
