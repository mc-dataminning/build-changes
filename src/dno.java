import com.mojang.serialization.MapCodec;

public class dno extends dnc {
   public static final MapCodec<dno> a = b(dno::new);
   public static final ece b = ebu.az;
   public static final int c = 15;
   private static final fgk d = dnc.b(14.0, 0.0, 16.0);
   private static final fgk e = dnc.b(14.0, 0.0, 15.0);
   private static final int f = 3;
   private static final int g = 8;
   private static final double h = 0.1;
   private static final double i = 0.25;

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   protected dno(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      iv $$4 = $$2.d();
      if ($$1.v($$4)) {
         int $$5 = 1;
         int $$6 = $$0.c(b);

         while ($$1.a_($$2.c($$5)).a(this)) {
            if (++$$5 == 3 && $$6 == 15) {
               return;
            }
         }

         if ($$6 == 8 && this.a(this.m(), $$1, $$2.d())) {
            double $$7 = $$5 >= 3 ? 0.25 : 0.1;
            if ($$3.j() <= $$7) {
               $$1.b($$4, dne.eh.m());
            }
         } else if ($$6 == 15 && $$5 < 3) {
            $$1.b($$4, this.m());
            ebe $$8 = $$0.b(b, Integer.valueOf(0));
            $$1.a($$2, $$8, 260);
            $$1.a($$8, $$4, this, null, false);
         }

         if ($$6 < 15) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 260);
         }
      }
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return d;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      for (jb $$3 : jb.c.a) {
         ebe $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(axj.b)) {
            return false;
         }
      }

      ebe $$5 = $$1.a_($$2.e());
      return ($$5.a(dne.eg) || $$5.a(axe.J)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      $$3.a($$1.al().k(), 1.0F);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
