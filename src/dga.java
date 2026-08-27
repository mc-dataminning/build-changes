import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dga extends cys {
   public static final MapCodec<dga> a = b(dga::new);
   public static final int b = 8;
   public static final dmj c = dlz.aF;
   protected static final eos[] d = new eos[]{
      eop.a(),
      cys.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   protected dga(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
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
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected eos b_(dlj $$0, cux $$1, hz $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected eos c(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dlj $$0) {
      return true;
   }

   @Override
   protected float d(dlj $$0, cux $$1, hz $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      dlj $$3 = $$1.a_($$2.d());
      if ($$3.a(aua.ch)) {
         return false;
      } else {
         return $$3.a(aua.ci) ? true : cys.a($$3.k($$1, $$2.d()), ie.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$1.a(cwa.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dlj $$0, crk $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ie.b : true;
      }
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      dlj $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }
}
