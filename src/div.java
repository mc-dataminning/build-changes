import com.mojang.serialization.MapCodec;
import java.util.Map;

public class div extends dey {
   public static final MapCodec<div> a = b(div::new);
   public static final dss b = dkm.b;
   public static final dss c = dkm.c;
   public static final dss d = dkm.d;
   public static final dss e = dkm.e;
   public static final dss f = dkm.f;
   public static final dss g = dkm.g;
   private static final Map<je, dss> h = dkm.h;

   @Override
   public MapCodec<div> a() {
      return a;
   }

   public div(dsa.d $$0) {
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
   public dsb a(cxz $$0) {
      dbd $$1 = $$0.q();
      iz $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(h.get($$1.a(je.c)), $$0.c(b))
         .a(h.get($$1.a(je.d)), $$0.c(d))
         .a(h.get($$1.a(je.f)), $$0.c(c))
         .a(h.get($$1.a(je.e)), $$0.c(e))
         .a(h.get($$1.a(je.b)), $$0.c(f))
         .a(h.get($$1.a(je.a)), $$0.c(g));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a(h.get($$1.b(je.c)), $$0.c(b))
         .a(h.get($$1.b(je.d)), $$0.c(d))
         .a(h.get($$1.b(je.f)), $$0.c(c))
         .a(h.get($$1.b(je.e)), $$0.c(e))
         .a(h.get($$1.b(je.b)), $$0.c(f))
         .a(h.get($$1.b(je.a)), $$0.c(g));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
