import com.mojang.serialization.MapCodec;

public class dfm extends dfa {
   public static final MapCodec<dfm> a = b(dfm::new);
   public static final int b = 6;
   public static final dtd c = dst.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ewl[] g = new ewl[]{
      dfa.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfa.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfa.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfa.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfa.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfa.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfa.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   protected dfm(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      cul $$7 = $$0.g();
      if ($$0.a(awy.aJ) && $$1.c(c) == 0 && dfa.a($$7) instanceof dfp $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, awa.dr, awb.e, 1.0F, 1.0F);
         $$2.b($$3, dfq.a($$8));
         $$2.a($$4, dww.c, $$3);
         $$4.b(awk.c.b($$7));
         return bqx.a;
      } else {
         return bqx.d;
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bqv.a;
         }

         if ($$3.b(bqu.a).e()) {
            return bqv.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bqv a(dca $$0, iz $$1, dsd $$2, cmy $$3) {
      if (!$$3.t(false)) {
         return bqv.e;
      } else {
         $$3.a(awk.U);
         $$3.gm().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dww.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dww.f, $$1);
         }

         return bqv.a;
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
