import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class der extends cwj {
   public static final MapCodec<der> a = b(der::new);
   public static final djr b = djq.B;

   @Override
   public MapCodec<der> a() {
      return a;
   }

   public der(diz.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dja a(cti $$0, hx $$1, dja $$2, cfb $$3) {
      if (!$$0.y_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cti $$0, hx $$1, cta $$2) {
      if (!$$0.B) {
         cbp $$3 = new cbp($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.s();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cti $$0, hx $$1) {
      a($$0, $$1, null);
   }

   private static void a(cti $$0, hx $$1, @Nullable bmf $$2) {
      if (!$$0.B) {
         cbp $$3 = new cbp($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dr(), $$3.dt(), $$3.dx(), arm.yB, arn.e, 1.0F, 1.0F);
         $$0.a($$2, dnk.I, $$1);
      }
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      cmr $$6 = $$3.b($$4);
      if (!$$6.a(cmu.op) && !$$6.a(cmu.tS)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, cwl.a.o(), 11);
         cmm $$7 = $$6.d();
         if (!$$3.f()) {
            if ($$6.a(cmu.op)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.h(1);
            }
         }

         $$3.b(arw.c.b($$7));
         return bjv.a($$1.B);
      }
   }

   @Override
   public void a(cti $$0, dja $$1, eli $$2, cft $$3) {
      if (!$$0.B) {
         hx $$4 = $$2.a();
         blp $$5 = $$3.w();
         if ($$3.bN() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bmf ? (bmf)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cta $$0) {
      return false;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }
}
