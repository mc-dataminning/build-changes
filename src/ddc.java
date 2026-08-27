import com.mojang.serialization.MapCodec;

public class ddc extends dew implements dfo {
   public static final MapCodec<ddc> b = b(ddc::new);
   public static final dlw c = dlv.C;
   public static final dlw d = dlv.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<ddc> a() {
      return b;
   }

   public ddc(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ie.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == egq.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(c) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dlf $$0, cvn $$1, hz $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dlf $$0, cvn $$1, hz $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$1.aa() && (long)$$1.z.a(200) <= $$1.X() % 200L && $$2.v() == $$1.a(dqo.a.b, $$2.u(), $$2.w()) - 1) {
         awk.a($$0.c(a).o(), $$1, $$2, 0.125, jz.aQ, blf.a(1, 2));
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(cvn $$0, dlf $$1, eno $$2, chz $$3) {
      if ($$0.aa() && $$3 instanceof cim && ((cim)$$3).K()) {
         hz $$4 = $$2.a();
         if ($$0.h($$4)) {
            bof $$5 = bnu.ak.a($$0);
            if ($$5 != null) {
               $$5.e(ens.c($$4.c()));
               bno $$6 = $$3.w();
               $$5.b($$6 instanceof aow ? (aow)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, atk.yZ, atl.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dlf $$0) {
      return true;
   }
}
