import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dhb extends dde {
   public static final MapCodec<dhb> a = b(dhb::new);
   public static final dqy b = dis.b;
   public static final dqy c = dis.c;
   public static final dqy d = dis.d;
   public static final dqy e = dis.e;
   public static final dqy f = dis.f;
   public static final dqy g = dis.g;
   private static final Map<is, dqy> h = dis.h;

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   public dhb(dqg.d $$0) {
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
   public dqh a(cwi $$0) {
      czj $$1 = $$0.q();
      in $$2 = $$0.a();
      return this.n()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(h.get($$1.a(is.c)), $$0.c(b))
         .a(h.get($$1.a(is.d)), $$0.c(d))
         .a(h.get($$1.a(is.f)), $$0.c(c))
         .a(h.get($$1.a(is.e)), $$0.c(e))
         .a(h.get($$1.a(is.b)), $$0.c(f))
         .a(h.get($$1.a(is.a)), $$0.c(g));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a(h.get($$1.b(is.c)), $$0.c(b))
         .a(h.get($$1.b(is.d)), $$0.c(d))
         .a(h.get($$1.b(is.f)), $$0.c(c))
         .a(h.get($$1.b(is.e)), $$0.c(e))
         .a(h.get($$1.b(is.b)), $$0.c(f))
         .a(h.get($$1.b(is.a)), $$0.c(g));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
