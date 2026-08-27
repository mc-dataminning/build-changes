import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvy extends czu {
   public static final MapCodec<cvy> a = b(cvy::new);
   public static final dkj b = dat.aE;
   private static final emv c = cwy.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final emv d = cwy.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final emv e = cwy.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final emv f = cwy.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final emv g = cwy.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final emv h = cwy.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final emv i = cwy.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final emv j = ems.a(c, d, e, f);
   private static final emv k = ems.a(c, g, h, i);
   private static final vg l = vg.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<cvy> a() {
      return a;
   }

   public cvy(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asd.aC);
         return bkc.b;
      }
   }

   @Nullable
   @Override
   public bkg b(djp $$0, ctx $$1, hx $$2) {
      return new bkm(($$2x, $$3, $$4) -> new cil($$2x, $$3, ciu.a($$1, $$2)), l);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      ic $$4 = $$0.c(b);
      return $$4.o() == ic.a.a ? j : k;
   }

   @Override
   protected void a(cca $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, djp $$3, cca $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(ctx $$0, hx $$1, cca $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bkv a(blw $$0) {
      return $$0.dM().b($$0);
   }

   @Nullable
   public static djp e(djp $$0) {
      if ($$0.a(cxa.gS)) {
         return cxa.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(cxa.gT) ? cxa.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
