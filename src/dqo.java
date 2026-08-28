import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dqo extends dmm {
   public static final MapCodec<dqo> a = b(dqo::new);
   public static final ebf b = dsg.b;
   public static final ebf c = dsg.c;
   public static final ebf d = dsg.d;
   public static final ebf e = dsg.e;
   public static final ebf f = dsg.f;
   public static final ebf g = dsg.g;
   private static final Map<jb, ebf> h = dsg.h;

   @Override
   public MapCodec<dqo> a() {
      return a;
   }

   public dqo(ean.d $$0) {
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
   public eao a(ddd $$0) {
      din $$1 = $$0.q();
      iv $$2 = $$0.a();
      return this.m()
         .b(g, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .b(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .b(b, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .b(c, Boolean.valueOf(!$$1.a_($$2.i()).a(this)))
         .b(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)))
         .b(e, Boolean.valueOf(!$$1.a_($$2.h()).a(this)));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(h.get($$1.a(jb.c)), $$0.c(b))
         .b(h.get($$1.a(jb.d)), $$0.c(d))
         .b(h.get($$1.a(jb.f)), $$0.c(c))
         .b(h.get($$1.a(jb.e)), $$0.c(e))
         .b(h.get($$1.a(jb.b)), $$0.c(f))
         .b(h.get($$1.a(jb.a)), $$0.c(g));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.b(h.get($$1.b(jb.c)), $$0.c(b))
         .b(h.get($$1.b(jb.d)), $$0.c(d))
         .b(h.get($$1.b(jb.f)), $$0.c(c))
         .b(h.get($$1.b(jb.e)), $$0.c(e))
         .b(h.get($$1.b(jb.b)), $$0.c(f))
         .b(h.get($$1.b(jb.a)), $$0.c(g));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
