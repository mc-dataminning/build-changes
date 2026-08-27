import com.mojang.serialization.MapCodec;

public class czo extends dbi implements dca {
   public static final MapCodec<czo> b = b(czo::new);
   public static final dhz c = dhy.C;
   public static final dhz d = dhy.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<czo> a() {
      return b;
   }

   public czo(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, hx.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ect.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(c) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dhi $$0, csa $$1, ht $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dhi $$0, csa $$1, ht $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$1.Z() && (long)$$1.z.a(200) <= $$1.W() % 200L && $$2.v() == $$1.a(dmr.a.b, $$2.u(), $$2.w()) - 1) {
         atp.a($$0.c(a).o(), $$1, $$2, 0.125, js.aO, bii.a(1, 2));
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.M().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(csa $$0, dhi $$1, ejq $$2, cem $$3) {
      if ($$0.Z() && $$3 instanceof cey && ((cey)$$3).K()) {
         ht $$4 = $$2.a();
         if ($$0.g($$4)) {
            blf $$5 = bku.ai.a($$0);
            if ($$5 != null) {
               $$5.e(eju.c($$4.c()));
               bkq $$6 = $$3.w();
               $$5.b($$6 instanceof amf ? (amf)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, aqr.yp, aqs.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   public boolean f_(dhi $$0) {
      return true;
   }
}
