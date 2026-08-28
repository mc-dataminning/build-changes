import com.mojang.serialization.MapCodec;

public class dfg extends deu {
   public static final MapCodec<dfg> a = b(dfg::new);
   public static final int b = 6;
   public static final dsx c = dsn.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ewf[] g = new ewf[]{
      deu.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      deu.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      deu.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      deu.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      deu.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      deu.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      deu.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   protected dfg(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      cuf $$7 = $$0.g();
      if ($$0.a(awu.aJ) && $$1.c(c) == 0 && deu.a($$7) instanceof dfj $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, avw.dr, avx.e, 1.0F, 1.0F);
         $$2.b($$3, dfk.a($$8));
         $$2.a($$4, dwq.c, $$3);
         $$4.b(awg.c.b($$7));
         return bqr.a;
      } else {
         return bqr.d;
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bqp.a;
         }

         if ($$3.b(bqo.a).e()) {
            return bqp.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bqp a(dbu $$0, iz $$1, drx $$2, cms $$3) {
      if (!$$3.t(false)) {
         return bqp.e;
      } else {
         $$3.a(awg.U);
         $$3.gm().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dwq.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dwq.f, $$1);
         }

         return bqp.a;
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
