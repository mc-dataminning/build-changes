import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cuf extends cyb {
   public static final MapCodec<cuf> a = b(cuf::new);
   public static final dih b = cza.aE;
   private static final eks c = cvf.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eks d = cvf.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eks e = cvf.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eks f = cvf.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eks g = cvf.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eks h = cvf.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eks i = cvf.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eks j = ekp.a(c, d, e, f);
   private static final eks k = ekp.a(c, g, h, i);
   private static final uv l = uv.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<cuf> a() {
      return a;
   }

   public cuf(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.c));
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arf.aC);
         return bjb.b;
      }
   }

   @Nullable
   @Override
   public bje b(dhn $$0, csf $$1, hx $$2) {
      return new bjk(($$2x, $$3, $$4) -> new cgt($$2x, $$3, chc.a($$1, $$2)), l);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      ib $$4 = $$0.c(b);
      return $$4.o() == ib.a.a ? j : k;
   }

   @Override
   protected void a(car $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, dhn $$3, car $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(csf $$0, hx $$1, car $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bjt a(bkv $$0) {
      return $$0.dO().b($$0);
   }

   @Nullable
   public static dhn e(dhn $$0) {
      if ($$0.a(cvh.gS)) {
         return cvh.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(cvh.gT) ? cvh.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
