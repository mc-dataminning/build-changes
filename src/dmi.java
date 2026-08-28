import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends dez {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final int b = 8;
   public static final dtc c = dss.aF;
   protected static final ewk[] d = new ewk[]{
      ewh.a(),
      dez.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   protected dmi(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
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
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected ewk b_(dsc $$0, dbe $$1, iz $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected ewk c(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean f_(dsc $$0) {
      return true;
   }

   @Override
   protected float d(dsc $$0, dbe $$1, iz $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      dsc $$3 = $$1.a_($$2.d());
      if ($$3.a(awp.co)) {
         return false;
      } else {
         return $$3.a(awp.cp) ? true : dez.a($$3.k($$1, $$2.d()), je.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.a(dch.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dsc $$0, cya $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.r()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == je.b : true;
      }
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dsc $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c);
   }
}
