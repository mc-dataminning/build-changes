import com.mojang.serialization.MapCodec;

public class cul extends cua {
   public static final MapCodec<cul> a = b(cul::new);
   public static final dhb b = dgr.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final eiy e = cua.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final eiy f = cua.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<cul> a() {
      return a;
   }

   protected cul(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      ht $$4 = $$2.c();
      if ($$1.t($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               dgb $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return e;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return f;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      for (hx $$3 : hx.c.a) {
         dgb $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(aqx.b)) {
            return false;
         }
      }

      dgb $$5 = $$1.a_($$2.d());
      return ($$5.a(cuc.dQ) || $$5.a(aqs.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      $$3.a($$1.ag().j(), 1.0F);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
