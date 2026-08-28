import com.mojang.serialization.MapCodec;

public class dfl extends dfa {
   public static final MapCodec<dfl> a = b(dfl::new);
   public static final dtd b = dst.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final ewl e = dfa.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final ewl f = dfa.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   protected dfl(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      iz $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               dsd $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return e;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return f;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      for (je $$3 : je.c.a) {
         dsd $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awv.b)) {
            return false;
         }
      }

      dsd $$5 = $$1.a_($$2.d());
      return ($$5.a(dfc.dQ) || $$5.a(awp.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      $$3.a($$1.aj().j(), 1.0F);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
