import com.mojang.serialization.MapCodec;
import java.util.Map;

public class diw extends dez {
   public static final MapCodec<diw> a = b(diw::new);
   public static final dst b = dkn.b;
   public static final dst c = dkn.c;
   public static final dst d = dkn.d;
   public static final dst e = dkn.e;
   public static final dst f = dkn.f;
   public static final dst g = dkn.g;
   private static final Map<je, dst> h = dkn.h;

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(dsb.d $$0) {
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
   public dsc a(cya $$0) {
      dbe $$1 = $$0.q();
      iz $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(h.get($$1.a(je.c)), $$0.c(b))
         .a(h.get($$1.a(je.d)), $$0.c(d))
         .a(h.get($$1.a(je.f)), $$0.c(c))
         .a(h.get($$1.a(je.e)), $$0.c(e))
         .a(h.get($$1.a(je.b)), $$0.c(f))
         .a(h.get($$1.a(je.a)), $$0.c(g));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a(h.get($$1.b(je.c)), $$0.c(b))
         .a(h.get($$1.b(je.d)), $$0.c(d))
         .a(h.get($$1.b(je.f)), $$0.c(c))
         .a(h.get($$1.b(je.e)), $$0.c(e))
         .a(h.get($$1.b(je.b)), $$0.c(f))
         .a(h.get($$1.b(je.a)), $$0.c(g));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
