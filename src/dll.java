import com.mojang.serialization.MapCodec;

public class dll extends dhj implements dkb, dkr {
   public static final MapCodec<dll> a = b(dll::new);
   public static final dvm<jl> b = dve.T;

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   protected dll(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.k));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public duo a(czk $$0) {
      jj $$1 = $$0.k();
      jj $$2;
      if ($$1.o() == jj.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jj.b;
      }

      return this.o().b(b, jl.a($$1, $$2));
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dsu($$0, $$1);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      drs $$5 = $$1.c_($$2);
      if ($$5 instanceof dsu && $$3.gz()) {
         $$3.a((dsu)$$5);
         return brp.a;
      } else {
         return brp.e;
      }
   }

   public static boolean a(epe.c $$0, epe.c $$1) {
      jj $$2 = o($$0.b());
      jj $$3 = o($$1.b());
      jj $$4 = p($$0.b());
      jj $$5 = p($$1.b());
      dsu.a $$6 = dsu.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dsu.a.b : dsu.a.a);
      boolean $$7 = $$6 == dsu.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static jj o(duo $$0) {
      return $$0.c(b).a();
   }

   public static jj p(duo $$0) {
      return $$0.c(b).b();
   }
}
