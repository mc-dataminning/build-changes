import com.mojang.serialization.MapCodec;

public class drq extends dkd {
   public static final MapCodec<drq> a = b(drq::new);
   public static final int b = 2;
   public static final dyn c = dye.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fcl g = dkd.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<drq> a() {
      return a;
   }

   public drq(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c);
   }

   @Override
   public fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return g;
   }

   public int o(dxo $$0) {
      return $$0.c(c);
   }

   private boolean q(dxo $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awv.zn, aww.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awv.zo, aww.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         ckf $$4 = bvi.bj.a($$1, bvh.e);
         if ($$4 != null) {
            fbr $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azu.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.B_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(eck.i, $$2, eck.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dxo $$0, euf $$1) {
      return false;
   }

   public static boolean a(dge $$0, jh $$1) {
      return $$0.a_($$1.e()).a(axk.cv);
   }
}
