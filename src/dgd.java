import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dgd extends dch {
   public static final MapCodec<dgd> a = b(dgd::new);
   public static final dpz b = dhu.b;
   public static final dpz c = dhu.c;
   public static final dpz d = dhu.d;
   public static final dpz e = dhu.e;
   public static final dpz f = dhu.f;
   public static final dpz g = dhu.g;
   private static final Map<ij, dpz> h = dhu.h;

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   public dgd(dph.d $$0) {
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
   public dpi a(cux $$0) {
      cym $$1 = $$0.q();
      id $$2 = $$0.a();
      return this.n()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(h.get($$1.a(ij.c)), $$0.c(b))
         .a(h.get($$1.a(ij.d)), $$0.c(d))
         .a(h.get($$1.a(ij.f)), $$0.c(c))
         .a(h.get($$1.a(ij.e)), $$0.c(e))
         .a(h.get($$1.a(ij.b)), $$0.c(f))
         .a(h.get($$1.a(ij.a)), $$0.c(g));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a(h.get($$1.b(ij.c)), $$0.c(b))
         .a(h.get($$1.b(ij.d)), $$0.c(d))
         .a(h.get($$1.b(ij.f)), $$0.c(c))
         .a(h.get($$1.b(ij.e)), $$0.c(e))
         .a(h.get($$1.b(ij.b)), $$0.c(f))
         .a(h.get($$1.b(ij.a)), $$0.c(g));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
