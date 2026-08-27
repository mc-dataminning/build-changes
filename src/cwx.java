import com.mojang.serialization.MapCodec;
import java.util.Map;

public class cwx extends ctc {
   public static final MapCodec<cwx> a = b(cwx::new);
   public static final dfu b = cyo.b;
   public static final dfu c = cyo.c;
   public static final dfu d = cyo.d;
   public static final dfu e = cyo.e;
   public static final dfu f = cyo.f;
   public static final dfu g = cyo.g;
   private static final Map<ha, dfu> h = cyo.h;

   @Override
   public MapCodec<cwx> a() {
      return a;
   }

   public cwx(dfc.d $$0) {
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
   public dfd a(clt $$0) {
      cph $$1 = $$0.q();
      gw $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(h.get($$1.a(ha.c)), $$0.c(b))
         .a(h.get($$1.a(ha.d)), $$0.c(d))
         .a(h.get($$1.a(ha.f)), $$0.c(c))
         .a(h.get($$1.a(ha.e)), $$0.c(e))
         .a(h.get($$1.a(ha.b)), $$0.c(f))
         .a(h.get($$1.a(ha.a)), $$0.c(g));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a(h.get($$1.b(ha.c)), $$0.c(b))
         .a(h.get($$1.b(ha.d)), $$0.c(d))
         .a(h.get($$1.b(ha.f)), $$0.c(c))
         .a(h.get($$1.b(ha.e)), $$0.c(e))
         .a(h.get($$1.b(ha.b)), $$0.c(f))
         .a(h.get($$1.b(ha.a)), $$0.c(g));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
