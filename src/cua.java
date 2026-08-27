import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cua extends cxw {
   public static final MapCodec<cua> a = b(cua::new);
   public static final dic b = cyv.aE;
   private static final ekn c = cva.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ekn d = cva.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ekn e = cva.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ekn f = cva.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ekn g = cva.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ekn h = cva.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ekn i = cva.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ekn j = ekk.a(c, d, e, f);
   private static final ekn k = ekk.a(c, g, h, i);
   private static final ur l = ur.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<cua> a() {
      return a;
   }

   public cua(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c));
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arb.aC);
         return bix.b;
      }
   }

   @Nullable
   @Override
   public bja b(dhi $$0, csa $$1, ht $$2) {
      return new bjf(($$2x, $$3, $$4) -> new cgo($$2x, $$3, cgx.a($$1, $$2)), l);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      hx $$4 = $$0.c(b);
      return $$4.o() == hx.a.a ? j : k;
   }

   @Override
   protected void a(cam $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, dhi $$3, cam $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(csa $$0, ht $$1, cam $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bjo a(bkq $$0) {
      return $$0.dO().b($$0);
   }

   @Nullable
   public static dhi e(dhi $$0) {
      if ($$0.a(cvc.gS)) {
         return cvc.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(cvc.gT) ? cvc.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
