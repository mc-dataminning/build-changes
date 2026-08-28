import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dlj extends dhm {
   public static final MapCodec<dlj> a = b(dlj::new);
   public static final dvj b = dna.b;
   public static final dvj c = dna.c;
   public static final dvj d = dna.d;
   public static final dvj e = dna.e;
   public static final dvj f = dna.f;
   public static final dvj g = dna.g;
   private static final Map<jk, dvj> h = dna.h;

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   public dlj(dur.d $$0) {
      super($$0);
      this.l(
         this.F
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
   public dus a(czn $$0) {
      ddo $$1 = $$0.q();
      jf $$2 = $$0.a();
      return this.n()
         .b(g, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .b(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .b(b, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .b(c, Boolean.valueOf(!$$1.a_($$2.i()).a(this)))
         .b(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)))
         .b(e, Boolean.valueOf(!$$1.a_($$2.h()).a(this)));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$2.a(this) ? $$0.b(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(h.get($$1.a(jk.c)), $$0.c(b))
         .b(h.get($$1.a(jk.d)), $$0.c(d))
         .b(h.get($$1.a(jk.f)), $$0.c(c))
         .b(h.get($$1.a(jk.e)), $$0.c(e))
         .b(h.get($$1.a(jk.b)), $$0.c(f))
         .b(h.get($$1.a(jk.a)), $$0.c(g));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.b(h.get($$1.b(jk.c)), $$0.c(b))
         .b(h.get($$1.b(jk.d)), $$0.c(d))
         .b(h.get($$1.b(jk.f)), $$0.c(c))
         .b(h.get($$1.b(jk.e)), $$0.c(e))
         .b(h.get($$1.b(jk.b)), $$0.c(f))
         .b(h.get($$1.b(jk.a)), $$0.c(g));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
