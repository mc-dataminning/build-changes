import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dfu extends dby {
   public static final MapCodec<dfu> a = b(dfu::new);
   public static final dpq b = dhl.b;
   public static final dpq c = dhl.c;
   public static final dpq d = dhl.d;
   public static final dpq e = dhl.e;
   public static final dpq f = dhl.f;
   public static final dpq g = dhl.g;
   private static final Map<ih, dpq> h = dhl.h;

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   public dfu(doy.d $$0) {
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
   public doz a(cuo $$0) {
      cyd $$1 = $$0.q();
      ib $$2 = $$0.a();
      return this.n()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(h.get($$1.a(ih.c)), $$0.c(b))
         .a(h.get($$1.a(ih.d)), $$0.c(d))
         .a(h.get($$1.a(ih.f)), $$0.c(c))
         .a(h.get($$1.a(ih.e)), $$0.c(e))
         .a(h.get($$1.a(ih.b)), $$0.c(f))
         .a(h.get($$1.a(ih.a)), $$0.c(g));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a(h.get($$1.b(ih.c)), $$0.c(b))
         .a(h.get($$1.b(ih.d)), $$0.c(d))
         .a(h.get($$1.b(ih.f)), $$0.c(c))
         .a(h.get($$1.b(ih.e)), $$0.c(e))
         .a(h.get($$1.b(ih.b)), $$0.c(f))
         .a(h.get($$1.b(ih.a)), $$0.c(g));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
