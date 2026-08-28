import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dpu extends dlu {
   public static final MapCodec<dpu> a = b(dpu::new);
   public static final eaf b = drm.b;
   public static final eaf c = drm.c;
   public static final eaf d = drm.d;
   public static final eaf e = drm.e;
   public static final eaf f = drm.f;
   public static final eaf g = drm.g;
   private static final Map<ja, eaf> h = drm.h;

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   public dpu(dzn.d $$0) {
      super($$0);
      this.l(
         this.B
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
   public dzo a(dcl $$0) {
      dhv $$1 = $$0.q();
      iu $$2 = $$0.a();
      return this.m()
         .b(g, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .b(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .b(b, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .b(c, Boolean.valueOf(!$$1.a_($$2.i()).a(this)))
         .b(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)))
         .b(e, Boolean.valueOf(!$$1.a_($$2.h()).a(this)));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(h.get($$1.a(ja.c)), $$0.c(b))
         .b(h.get($$1.a(ja.d)), $$0.c(d))
         .b(h.get($$1.a(ja.f)), $$0.c(c))
         .b(h.get($$1.a(ja.e)), $$0.c(e))
         .b(h.get($$1.a(ja.b)), $$0.c(f))
         .b(h.get($$1.a(ja.a)), $$0.c(g));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.b(h.get($$1.b(ja.c)), $$0.c(b))
         .b(h.get($$1.b(ja.d)), $$0.c(d))
         .b(h.get($$1.b(ja.f)), $$0.c(c))
         .b(h.get($$1.b(ja.e)), $$0.c(e))
         .b(h.get($$1.b(ja.b)), $$0.c(f))
         .b(h.get($$1.b(ja.a)), $$0.c(g));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
