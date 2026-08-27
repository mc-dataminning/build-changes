import com.mojang.serialization.MapCodec;

public class dip extends dkj implements dlb {
   public static final MapCodec<dip> b = b(dip::new);
   public static final dru c = drt.C;
   public static final dru d = drt.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dip> a() {
      return b;
   }

   public dip(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, it.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emx.c;
      return this.n().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(c) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(drd $$0, daz $$1, io $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(drd $$0, daz $$1, io $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$1.ab() && (long)$$1.z.a(200) <= $$1.Y() % 200L && $$2.v() == $$1.a(dwv.a.b, $$2.u(), $$2.w()) - 1) {
         ayi.a($$0.c(a).o(), $$1, $$2, 0.125, ky.aT, bph.a(1, 2));
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(daz $$0, drd $$1, eui $$2, cmq $$3) {
      if ($$0.ab() && $$3 instanceof cnd && ((cnd)$$3).K()) {
         io $$4 = $$2.a();
         if ($$0.h($$4)) {
            bsp $$5 = bsc.am.a($$0);
            if ($$5 != null) {
               $$5.e(eum.c($$4.c()));
               brw $$6 = $$3.s();
               $$5.b($$6 instanceof aqo ? (aqo)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, avi.zE, avj.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }
}
