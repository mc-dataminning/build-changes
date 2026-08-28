import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dnk extends djl {
   public static final MapCodec<dnk> a = b(dnk::new);
   public static final dxn b = dpd.b;
   public static final dxn c = dpd.c;
   public static final dxn d = dpd.d;
   public static final dxn e = dpd.e;
   public static final dxn f = dpd.f;
   public static final dxn g = dpd.g;
   private static final Map<jn, dxn> h = dpd.h;

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   public dnk(dwv.d $$0) {
      super($$0);
      this.l(
         this.F
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
   public dww a(daf $$0) {
      dfm $$1 = $$0.q();
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
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(h.get($$1.a(jn.c)), $$0.c(b))
         .b(h.get($$1.a(jn.d)), $$0.c(d))
         .b(h.get($$1.a(jn.f)), $$0.c(c))
         .b(h.get($$1.a(jn.e)), $$0.c(e))
         .b(h.get($$1.a(jn.b)), $$0.c(f))
         .b(h.get($$1.a(jn.a)), $$0.c(g));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.b(h.get($$1.b(jn.c)), $$0.c(b))
         .b(h.get($$1.b(jn.d)), $$0.c(d))
         .b(h.get($$1.b(jn.f)), $$0.c(c))
         .b(h.get($$1.b(jn.e)), $$0.c(e))
         .b(h.get($$1.b(jn.b)), $$0.c(f))
         .b(h.get($$1.b(jn.a)), $$0.c(g));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
