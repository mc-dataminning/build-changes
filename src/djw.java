import com.mojang.serialization.MapCodec;

public class djw extends djk {
   public static final MapCodec<djw> a = b(djw::new);
   public static final dxu b = dxl.az;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final fbs e = djk.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final fbs f = djk.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   protected djw(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      ji $$4 = $$2.d();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.m());
               dwv $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return e;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return f;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      for (jn $$3 : jn.c.a) {
         dwv $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awu.b)) {
            return false;
         }
      }

      dwv $$5 = $$1.a_($$2.e());
      return ($$5.a(djm.ed) || $$5.a(awo.J)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      $$3.a($$1.ak().k(), 1.0F);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
