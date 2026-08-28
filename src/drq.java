import com.mojang.serialization.MapCodec;
import java.util.Map;

public class drq extends dno {
   public static final MapCodec<drq> a = b(drq::new);
   public static final ech b = dti.b;
   public static final ech c = dti.c;
   public static final ech d = dti.d;
   public static final ech e = dti.e;
   public static final ech f = dti.f;
   public static final ech g = dti.g;
   private static final Map<jc, ech> h = dti.h;

   @Override
   public MapCodec<drq> a() {
      return a;
   }

   public drq(ebp.d $$0) {
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
   public ebq a(ded $$0) {
      djn $$1 = $$0.q();
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
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(h.get($$1.a(jc.c)), $$0.c(b))
         .b(h.get($$1.a(jc.d)), $$0.c(d))
         .b(h.get($$1.a(jc.f)), $$0.c(c))
         .b(h.get($$1.a(jc.e)), $$0.c(e))
         .b(h.get($$1.a(jc.b)), $$0.c(f))
         .b(h.get($$1.a(jc.a)), $$0.c(g));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.b(h.get($$1.b(jc.c)), $$0.c(b))
         .b(h.get($$1.b(jc.d)), $$0.c(d))
         .b(h.get($$1.b(jc.f)), $$0.c(c))
         .b(h.get($$1.b(jc.e)), $$0.c(e))
         .b(h.get($$1.b(jc.b)), $$0.c(f))
         .b(h.get($$1.b(jc.a)), $$0.c(g));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
