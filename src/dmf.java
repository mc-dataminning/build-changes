import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dmf extends dij {
   public static final MapCodec<dmf> a = b(dmf::new);
   public static final dwf b = dnw.b;
   public static final dwf c = dnw.c;
   public static final dwf d = dnw.d;
   public static final dwf e = dnw.e;
   public static final dwf f = dnw.f;
   public static final dwf g = dnw.g;
   private static final Map<jm, dwf> h = dnw.h;

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   public dmf(dvn.d $$0) {
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
   public dvo a(czw $$0) {
      dek $$1 = $$0.q();
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
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(h.get($$1.a(jm.c)), $$0.c(b))
         .b(h.get($$1.a(jm.d)), $$0.c(d))
         .b(h.get($$1.a(jm.f)), $$0.c(c))
         .b(h.get($$1.a(jm.e)), $$0.c(e))
         .b(h.get($$1.a(jm.b)), $$0.c(f))
         .b(h.get($$1.a(jm.a)), $$0.c(g));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.b(h.get($$1.b(jm.c)), $$0.c(b))
         .b(h.get($$1.b(jm.d)), $$0.c(d))
         .b(h.get($$1.b(jm.f)), $$0.c(c))
         .b(h.get($$1.b(jm.e)), $$0.c(e))
         .b(h.get($$1.b(jm.b)), $$0.c(f))
         .b(h.get($$1.b(jm.a)), $$0.c(g));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
