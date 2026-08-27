import com.mojang.serialization.MapCodec;

public class dgi extends dch implements dez, dfp {
   public static final MapCodec<dgi> a = b(dgi::new);
   public static final dqg<il> b = dpy.T;

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   protected dgi(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, il.k));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dpi a(cux $$0) {
      ij $$1 = $$0.k();
      ij $$2;
      if ($$1.o() == ij.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ij.b;
      }

      return this.n().a(b, il.a($$1, $$2));
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dno($$0, $$1);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      dmo $$5 = $$1.c_($$2);
      if ($$5 instanceof dno && $$3.gw()) {
         $$3.a((dno)$$5);
         return bof.a($$1.B);
      } else {
         return bof.d;
      }
   }

   public static boolean a(ejq.c $$0, ejq.c $$1) {
      ij $$2 = m($$0.b());
      ij $$3 = m($$1.b());
      ij $$4 = n($$0.b());
      ij $$5 = n($$1.b());
      dno.a $$6 = dno.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dno.a.b : dno.a.a);
      boolean $$7 = $$6 == dno.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ij m(dpi $$0) {
      return $$0.c(b).a();
   }

   public static ij n(dpi $$0) {
      return $$0.c(b).b();
   }
}
