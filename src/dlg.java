import com.mojang.serialization.MapCodec;

public class dlg extends dku {
   public static final MapCodec<dlg> a = b(dlg::new);
   public static final dzm b = dzc.az;
   public static final int c = 15;
   private static final fdo d = dku.b(14.0, 0.0, 16.0);
   private static final fdo e = dku.b(14.0, 0.0, 15.0);

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   protected dlg(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      jj $$4 = $$2.d();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.m());
               dym $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 260);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 260);
            }
         }
      }
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return d;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      for (jo $$3 : jo.c.a) {
         dym $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(axf.b)) {
            return false;
         }
      }

      dym $$5 = $$1.a_($$2.e());
      return ($$5.a(dkw.ed) || $$5.a(awz.J)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      $$3.a($$1.al().k(), 1.0F);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
