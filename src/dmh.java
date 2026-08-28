import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmh extends dey {
   public static final MapCodec<dmh> a = b(dmh::new);
   public static final int b = 8;
   public static final dtb c = dsr.aF;
   protected static final ewj[] d = new ewj[]{
      ewg.a(),
      dey.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   protected dmh(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
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
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected ewj b_(dsb $$0, dbd $$1, iz $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected ewj c(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean f_(dsb $$0) {
      return true;
   }

   @Override
   protected float d(dsb $$0, dbd $$1, iz $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      dsb $$3 = $$1.a_($$2.d());
      if ($$3.a(awo.co)) {
         return false;
      } else {
         return $$3.a(awo.cp) ? true : dey.a($$3.k($$1, $$2.d()), je.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$1.a(dcg.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dsb $$0, cxz $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.r()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == je.b : true;
      }
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c);
   }
}
