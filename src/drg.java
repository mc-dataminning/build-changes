import com.mojang.serialization.MapCodec;
import java.util.Map;

public class drg extends dne {
   public static final MapCodec<drg> a = b(drg::new);
   public static final ebx b = dsy.b;
   public static final ebx c = dsy.c;
   public static final ebx d = dsy.d;
   public static final ebx e = dsy.e;
   public static final ebx f = dsy.f;
   public static final ebx g = dsy.g;
   private static final Map<jc, ebx> h = dsy.h;

   @Override
   public MapCodec<drg> a() {
      return a;
   }

   public drg(ebf.d $$0) {
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
   public ebg a(ddt $$0) {
      djd $$1 = $$0.q();
      iw $$2 = $$0.a();
      return this.m()
         .b(g, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .b(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .b(b, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .b(c, Boolean.valueOf(!$$1.a_($$2.i()).a(this)))
         .b(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)))
         .b(e, Boolean.valueOf(!$$1.a_($$2.h()).a(this)));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(h.get($$1.a(jc.c)), $$0.c(b))
         .b(h.get($$1.a(jc.d)), $$0.c(d))
         .b(h.get($$1.a(jc.f)), $$0.c(c))
         .b(h.get($$1.a(jc.e)), $$0.c(e))
         .b(h.get($$1.a(jc.b)), $$0.c(f))
         .b(h.get($$1.a(jc.a)), $$0.c(g));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.b(h.get($$1.b(jc.c)), $$0.c(b))
         .b(h.get($$1.b(jc.d)), $$0.c(d))
         .b(h.get($$1.b(jc.f)), $$0.c(c))
         .b(h.get($$1.b(jc.e)), $$0.c(e))
         .b(h.get($$1.b(jc.b)), $$0.c(f))
         .b(h.get($$1.b(jc.a)), $$0.c(g));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
