import com.mojang.serialization.MapCodec;
import java.util.Map;

public class czb extends cvf {
   public static final MapCodec<czb> a = b(czb::new);
   public static final die b = das.b;
   public static final die c = das.c;
   public static final die d = das.d;
   public static final die e = das.e;
   public static final die f = das.f;
   public static final die g = das.g;
   private static final Map<ib, die> h = das.h;

   @Override
   public MapCodec<czb> a() {
      return a;
   }

   public czb(dhm.d $$0) {
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
   public dhn a(cnw $$0) {
      crl $$1 = $$0.q();
      hx $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(h.get($$1.a(ib.c)), $$0.c(b))
         .a(h.get($$1.a(ib.d)), $$0.c(d))
         .a(h.get($$1.a(ib.f)), $$0.c(c))
         .a(h.get($$1.a(ib.e)), $$0.c(e))
         .a(h.get($$1.a(ib.b)), $$0.c(f))
         .a(h.get($$1.a(ib.a)), $$0.c(g));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a(h.get($$1.b(ib.c)), $$0.c(b))
         .a(h.get($$1.b(ib.d)), $$0.c(d))
         .a(h.get($$1.b(ib.f)), $$0.c(c))
         .a(h.get($$1.b(ib.e)), $$0.c(e))
         .a(h.get($$1.b(ib.b)), $$0.c(f))
         .a(h.get($$1.b(ib.a)), $$0.c(g));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
