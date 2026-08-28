import com.mojang.serialization.MapCodec;

public class doe extends dgv {
   public static final MapCodec<doe> a = b(doe::new);
   public static final int b = 2;
   public static final dva c = duq.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final eyx g = dgv.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   public doe(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }

   @Override
   public eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return g;
   }

   public int o(dua $$0) {
      return $$0.c(c);
   }

   private boolean q(dua $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awd.yE, awe.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awd.yF, awe.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cim $$4 = btq.aR.a($$1, btp.e);
         if ($$4 != null) {
            eye $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azc.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.w_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dyx.i, $$2, dyx.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dua $$0, eqq $$1) {
      return false;
   }

   public static boolean a(dcx $$0, je $$1) {
      return $$0.a_($$1.e()).a(aws.ct);
   }
}
