import com.mojang.serialization.MapCodec;
import java.util.Map;

public class djd extends dfc {
   public static final MapCodec<djd> a = b(djd::new);
   public static final dtt b = dkw.b;
   public static final dtt c = dkw.c;
   public static final dtt d = dkw.d;
   public static final dtt e = dkw.e;
   public static final dtt f = dkw.f;
   public static final dtt g = dkw.g;
   private static final Map<iw, dtt> h = dkw.h;

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   public djd(dtb.d $$0) {
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
   public dtc a(cyd $$0) {
      dbg $$1 = $$0.q();
      ir $$2 = $$0.a();
      return this.n()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(h.get($$1.a(iw.c)), $$0.c(b))
         .a(h.get($$1.a(iw.d)), $$0.c(d))
         .a(h.get($$1.a(iw.f)), $$0.c(c))
         .a(h.get($$1.a(iw.e)), $$0.c(e))
         .a(h.get($$1.a(iw.b)), $$0.c(f))
         .a(h.get($$1.a(iw.a)), $$0.c(g));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a(h.get($$1.b(iw.c)), $$0.c(b))
         .a(h.get($$1.b(iw.d)), $$0.c(d))
         .a(h.get($$1.b(iw.f)), $$0.c(c))
         .a(h.get($$1.b(iw.e)), $$0.c(e))
         .a(h.get($$1.b(iw.b)), $$0.c(f))
         .a(h.get($$1.b(iw.a)), $$0.c(g));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
