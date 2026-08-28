import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dlu extends dhy {
   public static final MapCodec<dlu> a = b(dlu::new);
   public static final dvu b = dnl.b;
   public static final dvu c = dnl.c;
   public static final dvu d = dnl.d;
   public static final dvu e = dnl.e;
   public static final dvu f = dnl.f;
   public static final dvu g = dnl.g;
   private static final Map<jl, dvu> h = dnl.h;

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   public dlu(dvc.d $$0) {
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
   public dvd a(czm $$0) {
      dea $$1 = $$0.q();
      jg $$2 = $$0.a();
      return this.m()
         .b(g, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .b(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .b(b, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .b(c, Boolean.valueOf(!$$1.a_($$2.i()).a(this)))
         .b(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)))
         .b(e, Boolean.valueOf(!$$1.a_($$2.h()).a(this)));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$2.a(this) ? $$0.b(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(h.get($$1.a(jl.c)), $$0.c(b))
         .b(h.get($$1.a(jl.d)), $$0.c(d))
         .b(h.get($$1.a(jl.f)), $$0.c(c))
         .b(h.get($$1.a(jl.e)), $$0.c(e))
         .b(h.get($$1.a(jl.b)), $$0.c(f))
         .b(h.get($$1.a(jl.a)), $$0.c(g));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.b(h.get($$1.b(jl.c)), $$0.c(b))
         .b(h.get($$1.b(jl.d)), $$0.c(d))
         .b(h.get($$1.b(jl.f)), $$0.c(c))
         .b(h.get($$1.b(jl.e)), $$0.c(e))
         .b(h.get($$1.b(jl.b)), $$0.c(f))
         .b(h.get($$1.b(jl.a)), $$0.c(g));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
