import com.mojang.serialization.MapCodec;
import java.util.Map;

public class cyp extends cut {
   public static final MapCodec<cyp> a = b(cyp::new);
   public static final dhn b = dag.b;
   public static final dhn c = dag.c;
   public static final dhn d = dag.d;
   public static final dhn e = dag.e;
   public static final dhn f = dag.f;
   public static final dhn g = dag.g;
   private static final Map<hx, dhn> h = dag.h;

   @Override
   public MapCodec<cyp> a() {
      return a;
   }

   public cyp(dgv.d $$0) {
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
   public dgw a(cnj $$0) {
      cqy $$1 = $$0.q();
      ht $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(h.get($$1.a(hx.c)), $$0.c(b))
         .a(h.get($$1.a(hx.d)), $$0.c(d))
         .a(h.get($$1.a(hx.f)), $$0.c(c))
         .a(h.get($$1.a(hx.e)), $$0.c(e))
         .a(h.get($$1.a(hx.b)), $$0.c(f))
         .a(h.get($$1.a(hx.a)), $$0.c(g));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a(h.get($$1.b(hx.c)), $$0.c(b))
         .a(h.get($$1.b(hx.d)), $$0.c(d))
         .a(h.get($$1.b(hx.f)), $$0.c(c))
         .a(h.get($$1.b(hx.e)), $$0.c(e))
         .a(h.get($$1.b(hx.b)), $$0.c(f))
         .a(h.get($$1.b(hx.a)), $$0.c(g));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
