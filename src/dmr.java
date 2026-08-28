import com.mojang.serialization.MapCodec;

public class dmr extends diq implements dli, dlx {
   public static final MapCodec<dmr> a = b(dmr::new);
   public static final dws<jo> b = dwl.T;

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   protected dmr(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jo.k));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dvv a(dad $$0) {
      jm $$1 = $$0.k();
      jm $$2;
      if ($$1.o() == jm.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jm.b;
      }

      return this.m().b(b, jo.a($$1, $$2));
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dua($$0, $$1);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      dsy $$5 = $$1.c_($$2);
      if ($$5 instanceof dua && $$3.gE()) {
         $$3.a((dua)$$5);
         return bsk.a;
      } else {
         return bsk.e;
      }
   }

   public static boolean a(eqk.c $$0, eqk.c $$1) {
      jm $$2 = o($$0.b());
      jm $$3 = o($$1.b());
      jm $$4 = p($$0.b());
      jm $$5 = p($$1.b());
      dua.a $$6 = dua.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dua.a.b : dua.a.a);
      boolean $$7 = $$6 == dua.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static jm o(dvv $$0) {
      return $$0.c(b).a();
   }

   public static jm p(dvv $$0) {
      return $$0.c(b).b();
   }
}
