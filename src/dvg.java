import com.mojang.serialization.MapCodec;

public class dvg extends dno {
   public static final MapCodec<dvg> a = b(dvg::new);
   public static final int b = 2;
   public static final ecq c = ecg.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fgw g = dno.a(14.0, 12.0, 0.0, 16.0);

   @Override
   public MapCodec<dvg> a() {
      return a;
   }

   public dvg(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }

   @Override
   public fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return g;
   }

   public int o(ebq $$0) {
      return $$0.c(c);
   }

   private boolean q(ebq $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awy.zC, awz.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awy.zD, awz.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cmu $$4 = bxn.bk.a($$1, bxm.e);
         if ($$4 != null) {
            fgc $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azz.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.A_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(egq.i, $$2, egq.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   public static boolean a(djn $$0, iw $$1) {
      return $$0.a_($$1.e()).a(axn.cz);
   }
}
