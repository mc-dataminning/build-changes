import com.mojang.serialization.MapCodec;
import java.util.Map;

public class ddb extends czf {
   public static final MapCodec<ddb> a = b(ddb::new);
   public static final dmv b = des.b;
   public static final dmv c = des.c;
   public static final dmv d = des.d;
   public static final dmv e = des.e;
   public static final dmv f = des.f;
   public static final dmv g = des.g;
   private static final Map<ih, dmv> h = des.h;

   @Override
   public MapCodec<ddb> a() {
      return a;
   }

   public ddb(dmd.d $$0) {
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
   public dme a(crx $$0) {
      cvk $$1 = $$0.q();
      ib $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(h.get($$1.a(ih.c)), $$0.c(b))
         .a(h.get($$1.a(ih.d)), $$0.c(d))
         .a(h.get($$1.a(ih.f)), $$0.c(c))
         .a(h.get($$1.a(ih.e)), $$0.c(e))
         .a(h.get($$1.a(ih.b)), $$0.c(f))
         .a(h.get($$1.a(ih.a)), $$0.c(g));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a(h.get($$1.b(ih.c)), $$0.c(b))
         .a(h.get($$1.b(ih.d)), $$0.c(d))
         .a(h.get($$1.b(ih.f)), $$0.c(c))
         .a(h.get($$1.b(ih.e)), $$0.c(e))
         .a(h.get($$1.b(ih.b)), $$0.c(f))
         .a(h.get($$1.b(ih.a)), $$0.c(g));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
