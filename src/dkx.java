import com.mojang.serialization.MapCodec;

public class dkx extends dgv implements djn, dkd {
   public static final MapCodec<dkx> a = b(dkx::new);
   public static final duy<jl> b = duq.T;

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   protected dkx(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jl.k));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dua a(cyw $$0) {
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
   public dre a(je $$0, dua $$1) {
      return new dsg($$0, $$1);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      dre $$5 = $$1.c_($$2);
      if ($$5 instanceof dsg && $$3.gz()) {
         $$3.a((dsg)$$5);
         return brk.a;
      } else {
         return brk.e;
      }
   }

   public static boolean a(eoq.c $$0, eoq.c $$1) {
      jj $$2 = o($$0.b());
      jj $$3 = o($$1.b());
      jj $$4 = p($$0.b());
      jj $$5 = p($$1.b());
      dsg.a $$6 = dsg.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dsg.a.b : dsg.a.a);
      boolean $$7 = $$6 == dsg.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static jj o(dua $$0) {
      return $$0.c(b).a();
   }

   public static jj p(dua $$0) {
      return $$0.c(b).b();
   }
}
