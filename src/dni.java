import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dni extends dfy {
   public static final MapCodec<dni> a = b(dni::new);
   public static final int b = 8;
   public static final duc c = dts.aF;
   protected static final ext[] d = new ext[]{
      exq.a(),
      dfy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   protected dni(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      switch ($$1) {
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
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected ext b(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected ext b_(dtc $$0, dcc $$1, jd $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected ext c(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected float d(dtc $$0, dcc $$1, jd $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      dtc $$3 = $$1.a_($$2.e());
      if ($$3.a(awe.co)) {
         return false;
      } else {
         return $$3.a(awe.cp) ? true : dfy.a($$3.k($$1, $$2.e()), ji.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$1.a(ddf.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.r()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ji.b : true;
      }
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }
}
