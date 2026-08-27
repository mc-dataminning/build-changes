import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlz extends dlh implements djw {
   public static final MapCodec<dlz> a = b(dlz::new);
   public static final dqp c = dqo.C;

   @Override
   protected MapCodec<? extends dlz> a() {
      return a;
   }

   protected dlz(dpx.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(els.c)));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(c) ? els.c.a(true) : super.c_($$0);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }
}
