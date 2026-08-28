import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dks extends dgv {
   public static final MapCodec<dks> a = b(dks::new);
   public static final dur b = dmj.b;
   public static final dur c = dmj.c;
   public static final dur d = dmj.d;
   public static final dur e = dmj.e;
   public static final dur f = dmj.f;
   public static final dur g = dmj.g;
   private static final Map<jj, dur> h = dmj.h;

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dtz.d $$0) {
      super($$0);
      this.l(
         this.E
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
   public dua a(cyw $$0) {
      dcx $$1 = $$0.q();
      je $$2 = $$0.a();
      return this.o()
         .b(g, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .b(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .b(b, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .b(c, Boolean.valueOf(!$$1.a_($$2.i()).a(this)))
         .b(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)))
         .b(e, Boolean.valueOf(!$$1.a_($$2.h()).a(this)));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$2.a(this) ? $$0.b(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(h.get($$1.a(jj.c)), $$0.c(b))
         .b(h.get($$1.a(jj.d)), $$0.c(d))
         .b(h.get($$1.a(jj.f)), $$0.c(c))
         .b(h.get($$1.a(jj.e)), $$0.c(e))
         .b(h.get($$1.a(jj.b)), $$0.c(f))
         .b(h.get($$1.a(jj.a)), $$0.c(g));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.b(h.get($$1.b(jj.c)), $$0.c(b))
         .b(h.get($$1.b(jj.d)), $$0.c(d))
         .b(h.get($$1.b(jj.f)), $$0.c(c))
         .b(h.get($$1.b(jj.e)), $$0.c(e))
         .b(h.get($$1.b(jj.b)), $$0.c(f))
         .b(h.get($$1.b(jj.a)), $$0.c(g));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
