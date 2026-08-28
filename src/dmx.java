import com.mojang.serialization.MapCodec;

public class dmx extends dfd implements dex {
   public static final MapCodec<dmx> a = b(dmx::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dsx c = dsn.as;
   private static final ewf e = deu.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ewf f = deu.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return new cuk(cun.wr);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(drx $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         drx $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dwq.c, $$2, dwq.a.a($$5));
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if ($$3 instanceof btk && $$3.ak() != bsv.Q && $$3.ak() != bsv.h) {
         $$3.a($$0, new evm(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.du() || $$3.af != $$3.dA())) {
            double $$4 = Math.abs($$3.du() - $$3.ad);
            double $$5 = Math.abs($$3.dA() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.aj().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cun.ry) ? bqr.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cuk(cun.wr, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, avw.zp, avx.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         drx $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dwq.c, $$2, dwq.a.a($$3, $$8));
         return bqp.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
