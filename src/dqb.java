import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dqb extends dma {
   public static final MapCodec<dqb> a = b(dqb::new);
   public static final eaq b = drt.b;
   public static final eaq c = drt.c;
   public static final eaq d = drt.d;
   public static final eaq e = drt.e;
   public static final eaq f = drt.f;
   public static final eaq g = drt.g;
   private static final Map<ja, eaq> h = drt.h;

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   public dqb(dzy.d $$0) {
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
   public dzz a(dcr $$0) {
      dib $$1 = $$0.q();
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
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(h.get($$1.a(ja.c)), $$0.c(b))
         .b(h.get($$1.a(ja.d)), $$0.c(d))
         .b(h.get($$1.a(ja.f)), $$0.c(c))
         .b(h.get($$1.a(ja.e)), $$0.c(e))
         .b(h.get($$1.a(ja.b)), $$0.c(f))
         .b(h.get($$1.a(ja.a)), $$0.c(g));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.b(h.get($$1.b(ja.c)), $$0.c(b))
         .b(h.get($$1.b(ja.d)), $$0.c(d))
         .b(h.get($$1.b(ja.f)), $$0.c(c))
         .b(h.get($$1.b(ja.e)), $$0.c(e))
         .b(h.get($$1.b(ja.b)), $$0.c(f))
         .b(h.get($$1.b(ja.a)), $$0.c(g));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
