import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhr extends dcv implements djw {
   public static final MapCodec<dhr> a = b(dhr::new);
   public static final dqp b = dqo.C;

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   protected dhr(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dpy $$0, dpy $$1, ir $$2) {
      return $$1.a(dcx.ac) && $$2.o() == ir.a.b;
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == els.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
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

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }
}
