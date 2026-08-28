import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dew extends dis {
   public static final MapCodec<dew> a = b(dew::new);
   public static final dtu b = djs.aE;
   private static final exp c = dfw.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final exp d = dfw.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final exp e = dfw.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final exp f = dfw.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final exp g = dfw.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final exp h = dfw.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final exp i = dfw.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final exp j = exm.a(c, d, e, f);
   private static final exp k = exm.a(c, g, h, i);
   private static final wy l = wy.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   public dew(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c));
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avy.aC);
         return bqq.c;
      }
   }

   @Nullable
   @Override
   protected bqu b(dta $$0, dcu $$1, jd $$2) {
      return new bra(($$2x, $$3, $$4) -> new cpu($$2x, $$3, cqe.a($$1, $$2)), l);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      ji $$4 = $$0.c(b);
      return $$4.o() == ji.a.a ? j : k;
   }

   @Override
   protected void a(cje $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, dta $$3, cje $$4) {
      if (!$$4.aX()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dcu $$0, jd $$1, cje $$2) {
      if (!$$2.aX()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public brj a(bsq $$0) {
      return $$0.dR().b($$0);
   }

   @Nullable
   public static dta e(dta $$0) {
      if ($$0.a(dfy.gS)) {
         return dfy.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(dfy.gT) ? dfy.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   @Override
   public int b(dta $$0, dca $$1, jd $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
