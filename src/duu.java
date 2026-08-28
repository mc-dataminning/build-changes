import com.mojang.serialization.MapCodec;

public class duu extends dnc {
   public static final MapCodec<duu> a = b(duu::new);
   public static final int b = 2;
   public static final ece c = ebu.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fgk g = dnc.a(14.0, 12.0, 0.0, 16.0);

   @Override
   public MapCodec<duu> a() {
      return a;
   }

   public duu(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }

   @Override
   public fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return g;
   }

   public int o(ebe $$0) {
      return $$0.c(c);
   }

   private boolean q(ebe $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awp.zC, awq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awp.zD, awq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cmj $$4 = bxc.bk.a($$1, bxb.e);
         if ($$4 != null) {
            ffq $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azo.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.A_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(ege.i, $$2, ege.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   public static boolean a(djb $$0, iv $$1) {
      return $$0.a_($$1.e()).a(axe.cz);
   }
}
