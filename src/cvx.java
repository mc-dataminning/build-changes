import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvx extends cwq implements ddq {
   public static final MapCodec<cvx> a = b(cvx::new);
   public static final djy b = djx.C;

   @Override
   public MapCodec<cvx> a() {
      return a;
   }

   protected cvx(djg.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a_(djh $$0, csv $$1, hx $$2) {
      return true;
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.a;
   }

   @Override
   public float d(djh $$0, csv $$1, hx $$2) {
      return 1.0F;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(b) ? ees.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == ees.c));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public cmy a(@Nullable cfi $$0, ctq $$1, hx $$2, djh $$3) {
      return $$0 != null && $$0.f() ? ddq.super.a($$0, $$1, $$2, $$3) : cmy.f;
   }

   @Override
   public boolean a(@Nullable cfi $$0, csv $$1, hx $$2, djh $$3, eeq $$4) {
      return $$0 != null && $$0.f() ? ddq.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
