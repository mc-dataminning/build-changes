import com.mojang.serialization.MapCodec;

public class dcb extends cuj implements cud {
   public static final MapCodec<dcb> a = b(dcb::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dhb c = dgr.as;
   private static final eiy e = cua.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eiy f = cua.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dcb> a() {
      return a;
   }

   public dcb(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj(ckm.vv);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dgb $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dgb $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dkl.c, $$2, dkl.a.a($$5));
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if ($$3 instanceof bkj && $$3.ag() != bjx.N && $$3.ag() != bjx.h) {
         $$3.a($$0, new eif(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ac != $$3.dq() || $$3.ae != $$3.dw())) {
            double $$4 = Math.abs($$3.dq() - $$3.ac);
            double $$5 = Math.abs($$3.dw() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ag().s(), 1.0F);
            }
         }
      }
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      int $$6 = $$0.c(c);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(ckm.qK)) {
         return bib.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new ckj(ckm.vv, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, aqd.xH, aqe.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dgb $$9 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(dkl.c, $$2, dkl.a.a($$3, $$9));
         return bib.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
