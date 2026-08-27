import com.mojang.serialization.MapCodec;
import java.util.Map;

public class czv extends cvz {
   public static final MapCodec<czv> a = b(czv::new);
   public static final djg b = dbm.b;
   public static final djg c = dbm.c;
   public static final djg d = dbm.d;
   public static final djg e = dbm.e;
   public static final djg f = dbm.f;
   public static final djg g = dbm.g;
   private static final Map<ia, djg> h = dbm.h;

   @Override
   public MapCodec<czv> a() {
      return a;
   }

   public czv(dio.d $$0) {
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
   public dip a(coq $$0) {
      cse $$1 = $$0.q();
      hv $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(h.get($$1.a(ia.c)), $$0.c(b))
         .a(h.get($$1.a(ia.d)), $$0.c(d))
         .a(h.get($$1.a(ia.f)), $$0.c(c))
         .a(h.get($$1.a(ia.e)), $$0.c(e))
         .a(h.get($$1.a(ia.b)), $$0.c(f))
         .a(h.get($$1.a(ia.a)), $$0.c(g));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a(h.get($$1.b(ia.c)), $$0.c(b))
         .a(h.get($$1.b(ia.d)), $$0.c(d))
         .a(h.get($$1.b(ia.f)), $$0.c(c))
         .a(h.get($$1.b(ia.e)), $$0.c(e))
         .a(h.get($$1.b(ia.b)), $$0.c(f))
         .a(h.get($$1.b(ia.a)), $$0.c(g));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
