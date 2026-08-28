import com.mojang.serialization.MapCodec;
import java.util.Map;

public class djv extends dfy {
   public static final MapCodec<djv> a = b(djv::new);
   public static final dtt b = dlm.b;
   public static final dtt c = dlm.c;
   public static final dtt d = dlm.d;
   public static final dtt e = dlm.e;
   public static final dtt f = dlm.f;
   public static final dtt g = dlm.g;
   private static final Map<ji, dtt> h = dlm.h;

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   public djv(dtb.d $$0) {
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
      dcc $$1 = $$0.q();
      jd $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.i()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.h()).a(this)));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(h.get($$1.a(ji.c)), $$0.c(b))
         .a(h.get($$1.a(ji.d)), $$0.c(d))
         .a(h.get($$1.a(ji.f)), $$0.c(c))
         .a(h.get($$1.a(ji.e)), $$0.c(e))
         .a(h.get($$1.a(ji.b)), $$0.c(f))
         .a(h.get($$1.a(ji.a)), $$0.c(g));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a(h.get($$1.b(ji.c)), $$0.c(b))
         .a(h.get($$1.b(ji.d)), $$0.c(d))
         .a(h.get($$1.b(ji.f)), $$0.c(c))
         .a(h.get($$1.b(ji.e)), $$0.c(e))
         .a(h.get($$1.b(ji.b)), $$0.c(f))
         .a(h.get($$1.b(ji.a)), $$0.c(g));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
