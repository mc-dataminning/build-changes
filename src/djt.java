import com.mojang.serialization.MapCodec;
import java.util.Map;

public class djt extends dfw {
   public static final MapCodec<djt> a = b(djt::new);
   public static final dtr b = dlk.b;
   public static final dtr c = dlk.c;
   public static final dtr d = dlk.d;
   public static final dtr e = dlk.e;
   public static final dtr f = dlk.f;
   public static final dtr g = dlk.g;
   private static final Map<ji, dtr> h = dlk.h;

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   public djt(dsz.d $$0) {
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
   public dta a(cyb $$0) {
      dca $$1 = $$0.q();
      jd $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(h.get($$1.a(ji.c)), $$0.c(b))
         .a(h.get($$1.a(ji.d)), $$0.c(d))
         .a(h.get($$1.a(ji.f)), $$0.c(c))
         .a(h.get($$1.a(ji.e)), $$0.c(e))
         .a(h.get($$1.a(ji.b)), $$0.c(f))
         .a(h.get($$1.a(ji.a)), $$0.c(g));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a(h.get($$1.b(ji.c)), $$0.c(b))
         .a(h.get($$1.b(ji.d)), $$0.c(d))
         .a(h.get($$1.b(ji.f)), $$0.c(c))
         .a(h.get($$1.b(ji.e)), $$0.c(e))
         .a(h.get($$1.b(ji.b)), $$0.c(f))
         .a(h.get($$1.b(ji.a)), $$0.c(g));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
