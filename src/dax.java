import com.mojang.serialization.MapCodec;

public class dax extends dcr implements ddj {
   public static final MapCodec<dax> b = b(dax::new);
   public static final djr c = djq.C;
   public static final djr d = djq.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dax> a() {
      return b;
   }

   public dax(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eel.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(c) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dja $$0, cti $$1, hx $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dja $$0, cti $$1, hx $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if ($$1.aa() && (long)$$1.z.a(200) <= $$1.X() % 200L && $$2.v() == $$1.a(doj.a.b, $$2.u(), $$2.w()) - 1) {
         aul.a($$0.c(a).o(), $$1, $$2, 0.125, jx.aQ, bjg.a(1, 2));
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(cti $$0, dja $$1, eli $$2, cft $$3) {
      if ($$0.aa() && $$3 instanceof cgf && ((cgf)$$3).M()) {
         hx $$4 = $$2.a();
         if ($$0.h($$4)) {
            bme $$5 = blt.aj.a($$0);
            if ($$5 != null) {
               $$5.e(elm.c($$4.c()));
               blp $$6 = $$3.w();
               $$5.b($$6 instanceof ana ? (ana)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, arm.yK, arn.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }
}
