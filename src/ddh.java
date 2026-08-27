import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddh extends dea implements dlb {
   public static final MapCodec<ddh> a = b(ddh::new);
   public static final dru b = drt.C;

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   protected ddh(drc.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(drd $$0, daf $$1, io $$2) {
      return true;
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.a;
   }

   @Override
   protected float d(drd $$0, daf $$1, io $$2) {
      return 1.0F;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(b) ? emx.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == emx.c));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Override
   public ctq a(@Nullable cly $$0, dba $$1, io $$2, drd $$3) {
      return $$0 != null && $$0.f() ? dlb.super.a($$0, $$1, $$2, $$3) : ctq.i;
   }

   @Override
   public boolean a(@Nullable cly $$0, daf $$1, io $$2, drd $$3, emv $$4) {
      return $$0 != null && $$0.f() ? dlb.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
