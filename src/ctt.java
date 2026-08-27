import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ctt extends cxo {
   public static final MapCodec<ctt> a = b(ctt::new);
   public static final dhq b = cyo.aE;
   private static final ekb c = cut.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ekb d = cut.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ekb e = cut.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ekb f = cut.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ekb g = cut.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ekb h = cut.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ekb i = cut.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ekb j = ejy.a(c, d, e, f);
   private static final ekb k = ejy.a(c, g, h, i);
   private static final ur l = ur.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<ctt> a() {
      return a;
   }

   public ctt(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c));
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aqx.aC);
         return biq.b;
      }
   }

   @Nullable
   @Override
   public bit b(dgw $$0, crs $$1, ht $$2) {
      return new biy(($$2x, $$3, $$4) -> new cgg($$2x, $$3, cgp.a($$1, $$2)), l);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      hx $$4 = $$0.c(b);
      return $$4.o() == hx.a.a ? j : k;
   }

   @Override
   protected void a(cae $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, dgw $$3, cae $$4) {
      if (!$$4.aS()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(crs $$0, ht $$1, cae $$2) {
      if (!$$2.aS()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bjg a(bki $$0) {
      return $$0.dM().b($$0);
   }

   @Nullable
   public static dgw e(dgw $$0) {
      if ($$0.a(cuv.gS)) {
         return cuv.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(cuv.gT) ? cuv.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   @Override
   public int d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
