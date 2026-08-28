import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dow extends dhm {
   public static final MapCodec<dow> a = b(dow::new);
   public static final int b = 8;
   public static final dvs c = dvi.aF;
   protected static final ezq[] d = new ezq[]{
      ezn.a(),
      dhm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   protected dow(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
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
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected ezq b_(dus $$0, ddo $$1, jf $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected ezq c(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dus $$0) {
      return true;
   }

   @Override
   protected float c(dus $$0, ddo $$1, jf $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      dus $$3 = $$1.a_($$2.e());
      if ($$3.a(awv.cp)) {
         return false;
      } else {
         return $$3.a(awv.cq) ? true : dhm.a($$3.g($$1, $$2.e()), jk.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$1.a(des.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dus $$0, czn $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.q()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jk.b : true;
      }
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }
}
