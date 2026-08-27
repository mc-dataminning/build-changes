import com.mojang.serialization.MapCodec;

public class cwv extends cwj {
   public static final MapCodec<cwv> a = b(cwv::new);
   public static final int b = 6;
   public static final dka c = djq.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final emf[] g = new emf[]{
      cwj.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwj.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwj.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwj.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwj.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwj.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cwj.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<cwv> a() {
      return a;
   }

   protected cwv(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return g[$$0.c(c)];
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      cmr $$6 = $$3.b($$4);
      cmm $$7 = $$6.d();
      if ($$6.a(asj.ai) && $$0.c(c) == 0) {
         cwj $$8 = cwj.a($$7);
         if ($$8 instanceof cwy) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, arm.cT, arn.e, 1.0F, 1.0F);
            $$1.b($$2, cwz.a($$8));
            $$1.a($$3, dnk.c, $$2);
            $$3.b(arw.c.b($$7));
            return bjv.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bjv.a;
         }

         if ($$6.b()) {
            return bjv.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bjv a(ctj $$0, hx $$1, dja $$2, cfb $$3) {
      if (!$$3.t(false)) {
         return bjv.d;
      } else {
         $$3.a(arw.U);
         $$3.gc().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dnk.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dnk.f, $$1);
         }

         return bjv.a;
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
