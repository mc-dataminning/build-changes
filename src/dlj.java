import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlj extends dea {
   public static final MapCodec<dlj> a = b(dlj::new);
   public static final int b = 8;
   public static final dsd c = drt.aF;
   protected static final evf[] d = new evf[]{
      evc.a(),
      dea.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   protected dlj(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
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
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected evf b_(drd $$0, daf $$1, io $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected evf c(drd $$0, daf $$1, io $$2, eur $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean f_(drd $$0) {
      return true;
   }

   @Override
   protected float d(drd $$0, daf $$1, io $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      drd $$3 = $$1.a_($$2.d());
      if ($$3.a(avx.co)) {
         return false;
      } else {
         return $$3.a(avx.cp) ? true : dea.a($$3.k($$1, $$2.d()), it.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$1.a(dbi.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(drd $$0, cxb $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.r()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == it.b : true;
      }
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      drd $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }
}
