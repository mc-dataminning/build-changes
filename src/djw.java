import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djw extends dhv implements dpk {
   public static final MapCodec<djw> a = b(djw::new);
   public static final dwf b = dwe.C;
   private static final int d = 3;
   protected static final fal c = dij.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   public djw(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dtd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return a($$2, dst.z, $$0.C ? dtd::a : dtd::b);
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.b;
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(b) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axj.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
