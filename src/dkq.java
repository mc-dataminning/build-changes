import com.mojang.serialization.MapCodec;

public class dkq extends dke {
   public static final MapCodec<dkq> a = b(dkq::new);
   public static final dym b = dyd.ax;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final fcm e = dke.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final fcm f = dke.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   protected dkq(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      jh $$4 = $$2.d();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.m());
               dxn $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return e;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return f;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      for (jm $$3 : jm.c.a) {
         dxn $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(aya.b)) {
            return false;
         }
      }

      dxn $$5 = $$1.a_($$2.e());
      return ($$5.a(dkg.ed) || $$5.a(axu.J)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      $$3.a($$1.aj().k(), 1.0F);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
