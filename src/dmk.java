import com.mojang.serialization.MapCodec;

public class dmk extends dij implements dlb, dlq {
   public static final MapCodec<dmk> a = b(dmk::new);
   public static final dwl<jo> b = dwe.T;

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   protected dmk(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jo.k));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dvo a(czw $$0) {
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
   public dsr a(jh $$0, dvo $$1) {
      return new dtt($$0, $$1);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      dsr $$5 = $$1.c_($$2);
      if ($$5 instanceof dtt && $$3.gJ()) {
         $$3.a((dtt)$$5);
         return bsh.a;
      } else {
         return bsh.e;
      }
   }

   public static boolean a(eqd.c $$0, eqd.c $$1) {
      jm $$2 = o($$0.b());
      jm $$3 = o($$1.b());
      jm $$4 = p($$0.b());
      jm $$5 = p($$1.b());
      dtt.a $$6 = dtt.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dtt.a.b : dtt.a.a);
      boolean $$7 = $$6 == dtt.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static jm o(dvo $$0) {
      return $$0.c(b).a();
   }

   public static jm p(dvo $$0) {
      return $$0.c(b).b();
   }
}
