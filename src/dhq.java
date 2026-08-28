import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhq extends dij implements dpk {
   public static final MapCodec<dhq> a = b(dhq::new);
   public static final dwf b = dwe.C;

   @Override
   public MapCodec<dhq> a() {
      return a;
   }

   protected dhq(dvn.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dvo $$0) {
      return $$0.y().c();
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.a;
   }

   @Override
   protected float c(dvo $$0, dek $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(b) ? erp.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == erp.c));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   public cwf a(@Nullable cor $$0, dfg $$1, jh $$2, dvo $$3) {
      return $$0 != null && $$0.f() ? dpk.super.a($$0, $$1, $$2, $$3) : cwf.k;
   }

   @Override
   public boolean a(@Nullable cor $$0, dek $$1, jh $$2, dvo $$3, ern $$4) {
      return $$0 != null && $$0.f() ? dpk.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
