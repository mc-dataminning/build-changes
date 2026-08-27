import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfw extends cyo {
   public static final MapCodec<dfw> a = b(dfw::new);
   public static final int b = 8;
   public static final dmf c = dlv.aF;
   protected static final eol[] d = new eol[]{
      eoi.a(),
      cyo.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dfw> a() {
      return a;
   }

   protected dfw(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
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
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected eol b_(dlf $$0, cut $$1, hz $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected eol c(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dlf $$0) {
      return true;
   }

   @Override
   protected float d(dlf $$0, cut $$1, hz $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      dlf $$3 = $$1.a_($$2.d());
      if ($$3.a(atz.ch)) {
         return false;
      } else {
         return $$3.a(atz.ci) ? true : cyo.a($$3.k($$1, $$2.d()), ie.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$1.a(cvw.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dlf $$0, crg $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ie.b : true;
      }
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }
}
