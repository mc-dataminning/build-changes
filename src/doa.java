import com.mojang.serialization.MapCodec;

public class doa extends dno {
   public static final MapCodec<doa> a = b(doa::new);
   public static final ecq b = ecg.az;
   public static final int c = 15;
   private static final fgw d = dno.b(14.0, 0.0, 16.0);
   private static final fgw e = dno.b(14.0, 0.0, 15.0);
   private static final int f = 3;
   private static final int g = 8;
   private static final double h = 0.1;
   private static final double i = 0.25;

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   protected doa(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      iw $$4 = $$2.d();
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
               $$1.b($$4, dnq.eh.m());
            }
         } else if ($$6 == 15 && $$5 < 3) {
            $$1.b($$4, this.m());
            ebq $$8 = $$0.b(b, Integer.valueOf(0));
            $$1.a($$2, $$8, 260);
            $$1.a($$8, $$4, this, null, false);
         }

         if ($$6 < 15) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 260);
         }
      }
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      for (jc $$3 : jc.c.a) {
         ebq $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(axs.b)) {
            return false;
         }
      }

      ebq $$5 = $$1.a_($$2.e());
      return ($$5.a(dnq.eg) || $$5.a(axn.J)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      $$3.a($$1.al().k(), 1.0F);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
