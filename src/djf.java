import com.mojang.serialization.MapCodec;
import java.util.Map;

public class djf extends dfi {
   public static final MapCodec<djf> a = b(djf::new);
   public static final dtc b = dkw.b;
   public static final dtc c = dkw.c;
   public static final dtc d = dkw.d;
   public static final dtc e = dkw.e;
   public static final dtc f = dkw.f;
   public static final dtc g = dkw.g;
   private static final Map<jf, dtc> h = dkw.h;

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   public djf(dsk.d $$0) {
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
   public dsl a(cxn $$0) {
      dbm $$1 = $$0.q();
      ja $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(h.get($$1.a(jf.c)), $$0.c(b))
         .a(h.get($$1.a(jf.d)), $$0.c(d))
         .a(h.get($$1.a(jf.f)), $$0.c(c))
         .a(h.get($$1.a(jf.e)), $$0.c(e))
         .a(h.get($$1.a(jf.b)), $$0.c(f))
         .a(h.get($$1.a(jf.a)), $$0.c(g));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a(h.get($$1.b(jf.c)), $$0.c(b))
         .a(h.get($$1.b(jf.d)), $$0.c(d))
         .a(h.get($$1.b(jf.f)), $$0.c(c))
         .a(h.get($$1.b(jf.e)), $$0.c(e))
         .a(h.get($$1.b(jf.b)), $$0.c(f))
         .a(h.get($$1.b(jf.a)), $$0.c(g));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
