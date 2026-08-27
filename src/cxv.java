import com.mojang.serialization.MapCodec;
import java.util.Map;

public class cxv extends cua {
   public static final MapCodec<cxv> a = b(cxv::new);
   public static final dgs b = czm.b;
   public static final dgs c = czm.c;
   public static final dgs d = czm.d;
   public static final dgs e = czm.e;
   public static final dgs f = czm.f;
   public static final dgs g = czm.g;
   private static final Map<hx, dgs> h = czm.h;

   @Override
   public MapCodec<cxv> a() {
      return a;
   }

   public cxv(dga.d $$0) {
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
   public dgb a(cmr $$0) {
      cqf $$1 = $$0.q();
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
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(h.get($$1.a(hx.c)), $$0.c(b))
         .a(h.get($$1.a(hx.d)), $$0.c(d))
         .a(h.get($$1.a(hx.f)), $$0.c(c))
         .a(h.get($$1.a(hx.e)), $$0.c(e))
         .a(h.get($$1.a(hx.b)), $$0.c(f))
         .a(h.get($$1.a(hx.a)), $$0.c(g));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a(h.get($$1.b(hx.c)), $$0.c(b))
         .a(h.get($$1.b(hx.d)), $$0.c(d))
         .a(h.get($$1.b(hx.f)), $$0.c(c))
         .a(h.get($$1.b(hx.e)), $$0.c(e))
         .a(h.get($$1.b(hx.b)), $$0.c(f))
         .a(h.get($$1.b(hx.a)), $$0.c(g));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
