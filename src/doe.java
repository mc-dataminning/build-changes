import com.mojang.serialization.MapCodec;
import java.util.Map;

public class doe extends dke {
   public static final MapCodec<doe> a = b(doe::new);
   public static final dyh b = dpw.b;
   public static final dyh c = dpw.c;
   public static final dyh d = dpw.d;
   public static final dyh e = dpw.e;
   public static final dyh f = dpw.f;
   public static final dyh g = dpw.g;
   private static final Map<jn, dyh> h = dpw.h;

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   public doe(dxp.d $$0) {
      super($$0);
      this.l(
         this.B
            .b()
            .b(b, Boolean.valueOf(true))
            .b(c, Boolean.valueOf(true))
            .b(d, Boolean.valueOf(true))
            .b(e, Boolean.valueOf(true))
            .b(f, Boolean.valueOf(true))
            .b(g, Boolean.valueOf(true))
      );
   }

   @Override
   public dxq a(dax $$0) {
      dgf $$1 = $$0.q();
      ji $$2 = $$0.a();
      return this.m()
         .b(g, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .b(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .b(b, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .b(c, Boolean.valueOf(!$$1.a_($$2.i()).a(this)))
         .b(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)))
         .b(e, Boolean.valueOf(!$$1.a_($$2.h()).a(this)));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(h.get($$1.a(jn.c)), $$0.c(b))
         .b(h.get($$1.a(jn.d)), $$0.c(d))
         .b(h.get($$1.a(jn.f)), $$0.c(c))
         .b(h.get($$1.a(jn.e)), $$0.c(e))
         .b(h.get($$1.a(jn.b)), $$0.c(f))
         .b(h.get($$1.a(jn.a)), $$0.c(g));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.b(h.get($$1.b(jn.c)), $$0.c(b))
         .b(h.get($$1.b(jn.d)), $$0.c(d))
         .b(h.get($$1.b(jn.f)), $$0.c(c))
         .b(h.get($$1.b(jn.e)), $$0.c(e))
         .b(h.get($$1.b(jn.b)), $$0.c(f))
         .b(h.get($$1.b(jn.a)), $$0.c(g));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
