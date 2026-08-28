import com.mojang.serialization.MapCodec;

public class dhu extends dhj {
   public static final MapCodec<dhu> a = b(dhu::new);
   public static final dvo b = dve.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final ezm e = dhj.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final ezm f = dhj.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   protected dhu(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      je $$4 = $$2.d();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               duo $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return e;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return f;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      for (jj $$3 : jj.c.a) {
         duo $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awz.b)) {
            return false;
         }
      }

      duo $$5 = $$1.a_($$2.e());
      return ($$5.a(dhl.dQ) || $$5.a(awt.I)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      $$3.a($$1.ak().k(), 1.0F);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
