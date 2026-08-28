import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dqh extends dmf {
   public static final MapCodec<dqh> a = b(dqh::new);
   public static final eay b = drz.b;
   public static final eay c = drz.c;
   public static final eay d = drz.d;
   public static final eay e = drz.e;
   public static final eay f = drz.f;
   public static final eay g = drz.g;
   private static final Map<ja, eay> h = drz.h;

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   public dqh(eag.d $$0) {
      super($$0);
      this.l(
         this.C
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
   public eah a(dcw $$0) {
      dig $$1 = $$0.q();
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
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(h.get($$1.a(ja.c)), $$0.c(b))
         .b(h.get($$1.a(ja.d)), $$0.c(d))
         .b(h.get($$1.a(ja.f)), $$0.c(c))
         .b(h.get($$1.a(ja.e)), $$0.c(e))
         .b(h.get($$1.a(ja.b)), $$0.c(f))
         .b(h.get($$1.a(ja.a)), $$0.c(g));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.b(h.get($$1.b(ja.c)), $$0.c(b))
         .b(h.get($$1.b(ja.d)), $$0.c(d))
         .b(h.get($$1.b(ja.f)), $$0.c(c))
         .b(h.get($$1.b(ja.e)), $$0.c(e))
         .b(h.get($$1.b(ja.b)), $$0.c(f))
         .b(h.get($$1.b(ja.a)), $$0.c(g));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
