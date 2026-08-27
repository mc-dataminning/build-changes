import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbh extends cua {
   public static final MapCodec<dbh> a = b(dbh::new);
   public static final int b = 8;
   public static final dhb c = dgr.aF;
   protected static final eiy[] d = new eiy[]{
      eiv.a(),
      cua.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dbh> a() {
      return a;
   }

   protected dbh(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
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
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   public eiy b_(dgb $$0, cqf $$1, ht $$2) {
      return d[$$0.c(c)];
   }

   @Override
   public eiy b(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public boolean g_(dgb $$0) {
      return true;
   }

   @Override
   public float b(dgb $$0, cqf $$1, ht $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      dgb $$3 = $$1.a_($$2.d());
      if ($$3.a(aqs.cg)) {
         return false;
      } else {
         return $$3.a(aqs.ch) ? true : cua.a($$3.k($$1, $$2.d()), hx.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$1.a(cri.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dgb $$0, cmr $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == hx.b : true;
      }
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c);
   }
}
