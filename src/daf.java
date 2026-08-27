import com.mojang.serialization.MapCodec;
import java.util.Map;

public class daf extends cwj {
   public static final MapCodec<daf> a = b(daf::new);
   public static final djr b = dbw.b;
   public static final djr c = dbw.c;
   public static final djr d = dbw.d;
   public static final djr e = dbw.e;
   public static final djr f = dbw.f;
   public static final djr g = dbw.g;
   private static final Map<ic, djr> h = dbw.h;

   @Override
   public MapCodec<daf> a() {
      return a;
   }

   public daf(diz.d $$0) {
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
   public dja a(cpa $$0) {
      cso $$1 = $$0.q();
      hx $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(h.get($$1.a(ic.c)), $$0.c(b))
         .a(h.get($$1.a(ic.d)), $$0.c(d))
         .a(h.get($$1.a(ic.f)), $$0.c(c))
         .a(h.get($$1.a(ic.e)), $$0.c(e))
         .a(h.get($$1.a(ic.b)), $$0.c(f))
         .a(h.get($$1.a(ic.a)), $$0.c(g));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a(h.get($$1.b(ic.c)), $$0.c(b))
         .a(h.get($$1.b(ic.d)), $$0.c(d))
         .a(h.get($$1.b(ic.f)), $$0.c(c))
         .a(h.get($$1.b(ic.e)), $$0.c(e))
         .a(h.get($$1.b(ic.b)), $$0.c(f))
         .a(h.get($$1.b(ic.a)), $$0.c(g));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
