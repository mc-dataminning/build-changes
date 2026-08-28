import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dod extends dke {
   public static final MapCodec<dod> a = b(dod::new);
   public static final dye b = dpu.b;
   public static final dye c = dpu.c;
   public static final dye d = dpu.d;
   public static final dye e = dpu.e;
   public static final dye f = dpu.f;
   public static final dye g = dpu.g;
   private static final Map<jm, dye> h = dpu.h;

   @Override
   public MapCodec<dod> a() {
      return a;
   }

   public dod(dxm.d $$0) {
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
   public dxn a(dbb $$0) {
      dgf $$1 = $$0.q();
      jh $$2 = $$0.a();
      return this.m()
         .b(g, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .b(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .b(b, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .b(c, Boolean.valueOf(!$$1.a_($$2.i()).a(this)))
         .b(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)))
         .b(e, Boolean.valueOf(!$$1.a_($$2.h()).a(this)));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(h.get($$1.a(jm.c)), $$0.c(b))
         .b(h.get($$1.a(jm.d)), $$0.c(d))
         .b(h.get($$1.a(jm.f)), $$0.c(c))
         .b(h.get($$1.a(jm.e)), $$0.c(e))
         .b(h.get($$1.a(jm.b)), $$0.c(f))
         .b(h.get($$1.a(jm.a)), $$0.c(g));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.b(h.get($$1.b(jm.c)), $$0.c(b))
         .b(h.get($$1.b(jm.d)), $$0.c(d))
         .b(h.get($$1.b(jm.f)), $$0.c(c))
         .b(h.get($$1.b(jm.e)), $$0.c(e))
         .b(h.get($$1.b(jm.b)), $$0.c(f))
         .b(h.get($$1.b(jm.a)), $$0.c(g));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
