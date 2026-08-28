import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dlm extends dpk {
   public static final MapCodec<dlm> a = b(dlm::new);
   public static final ebm<jb> b = dqn.e;
   private static final Map<jb.a, ffr> c = ffo.a(
      ffo.a(dmm.b(12.0, 0.0, 4.0), dmm.a(8.0, 10.0, 4.0, 5.0), dmm.a(4.0, 8.0, 5.0, 10.0), dmm.a(10.0, 16.0, 10.0, 16.0))
   );
   private static final wy d = wy.c("container.repair");
   private static final float e = 2.0F;
   private static final int f = 40;

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   public dlm(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c));
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aC);
      }

      return bug.a;
   }

   @Nullable
   @Override
   protected bui b(eao $$0, djh $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cvf($$2x, $$3, cvp.a($$1, $$2)), d);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c.get($$0.c(b).o());
   }

   @Override
   protected void a(cnn $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, eao $$3, cnn $$4) {
      if (!$$4.aZ()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(djh $$0, iv $$1, cnn $$2) {
      if (!$$2.aZ()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bux a(bwi $$0) {
      return $$0.dV().b($$0);
   }

   @Nullable
   public static eao e(eao $$0) {
      if ($$0.a(dmo.ht)) {
         return dmo.hu.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dmo.hu) ? dmo.hv.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Override
   public int b(eao $$0, din $$1, iv $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
