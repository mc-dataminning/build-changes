import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dgs extends dcv {
   public static final MapCodec<dgs> a = b(dgs::new);
   public static final dqp b = dij.b;
   public static final dqp c = dij.c;
   public static final dqp d = dij.d;
   public static final dqp e = dij.e;
   public static final dqp f = dij.f;
   public static final dqp g = dij.g;
   private static final Map<ir, dqp> h = dij.h;

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   public dgs(dpx.d $$0) {
      super($$0);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(true))
            .a(c, Boolean.valueOf(true))
            .a(d, Boolean.valueOf(true))
            .a(e, Boolean.valueOf(true))
            .a(f, Boolean.valueOf(true))
            .a(g, Boolean.valueOf(true))
      );
   }

   @Override
   public dpy a(cvl $$0) {
      cza $$1 = $$0.q();
      im $$2 = $$0.a();
      return this.n()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(h.get($$1.a(ir.c)), $$0.c(b))
         .a(h.get($$1.a(ir.d)), $$0.c(d))
         .a(h.get($$1.a(ir.f)), $$0.c(c))
         .a(h.get($$1.a(ir.e)), $$0.c(e))
         .a(h.get($$1.a(ir.b)), $$0.c(f))
         .a(h.get($$1.a(ir.a)), $$0.c(g));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a(h.get($$1.b(ir.c)), $$0.c(b))
         .a(h.get($$1.b(ir.d)), $$0.c(d))
         .a(h.get($$1.b(ir.f)), $$0.c(c))
         .a(h.get($$1.b(ir.e)), $$0.c(e))
         .a(h.get($$1.b(ir.b)), $$0.c(f))
         .a(h.get($$1.b(ir.a)), $$0.c(g));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
