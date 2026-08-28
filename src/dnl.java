import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dnl extends djm {
   public static final MapCodec<dnl> a = b(dnl::new);
   public static final dxo b = dpe.b;
   public static final dxo c = dpe.c;
   public static final dxo d = dpe.d;
   public static final dxo e = dpe.e;
   public static final dxo f = dpe.f;
   public static final dxo g = dpe.g;
   private static final Map<jn, dxo> h = dpe.h;

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   public dnl(dww.d $$0) {
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
   public dwx a(dag $$0) {
      dfn $$1 = $$0.q();
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
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(h.get($$1.a(jn.c)), $$0.c(b))
         .b(h.get($$1.a(jn.d)), $$0.c(d))
         .b(h.get($$1.a(jn.f)), $$0.c(c))
         .b(h.get($$1.a(jn.e)), $$0.c(e))
         .b(h.get($$1.a(jn.b)), $$0.c(f))
         .b(h.get($$1.a(jn.a)), $$0.c(g));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.b(h.get($$1.b(jn.c)), $$0.c(b))
         .b(h.get($$1.b(jn.d)), $$0.c(d))
         .b(h.get($$1.b(jn.f)), $$0.c(c))
         .b(h.get($$1.b(jn.e)), $$0.c(e))
         .b(h.get($$1.b(jn.b)), $$0.c(f))
         .b(h.get($$1.b(jn.a)), $$0.c(g));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
