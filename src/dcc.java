import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcc extends dcv implements djw {
   public static final MapCodec<dcc> a = b(dcc::new);
   public static final dqp b = dqo.C;

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   protected dcc(dpx.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dpy $$0, cza $$1, im $$2) {
      return true;
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.a;
   }

   @Override
   protected float d(dpy $$0, cza $$1, im $$2) {
      return 1.0F;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(b) ? els.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == els.c));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   public csd a(@Nullable ckl $$0, czv $$1, im $$2, dpy $$3) {
      return $$0 != null && $$0.f() ? djw.super.a($$0, $$1, $$2, $$3) : csd.i;
   }

   @Override
   public boolean a(@Nullable ckl $$0, cza $$1, im $$2, dpy $$3, elq $$4) {
      return $$0 != null && $$0.f() ? djw.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
