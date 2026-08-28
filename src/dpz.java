import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpz extends diq {
   public static final MapCodec<dpz> a = b(dpz::new);
   public static final int b = 8;
   public static final dwu c = dwl.aF;
   protected static final fas[] d = new fas[]{
      fap.a(),
      diq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dpz> a() {
      return a;
   }

   protected dpz(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
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
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected fas b_(dvv $$0, der $$1, jh $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected fas c(dvv $$0, der $$1, jh $$2, fad $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dvv $$0) {
      return true;
   }

   @Override
   protected float c(dvv $$0, der $$1, jh $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      dvv $$3 = $$1.a_($$2.e());
      if ($$3.a(axc.cq)) {
         return false;
      } else {
         return $$3.a(axc.cr) ? true : diq.a($$3.g($$1, $$2.e()), jm.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$1.a(dfv.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dvv $$0, dad $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jm.b : true;
      }
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dvv $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }
}
