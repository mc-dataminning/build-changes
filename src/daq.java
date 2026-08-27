import com.mojang.serialization.MapCodec;

public class daq extends cwp implements czh, czx {
   public static final MapCodec<daq> a = b(daq::new);
   public static final dke<ie> b = djw.T;

   @Override
   public MapCodec<daq> a() {
      return a;
   }

   protected daq(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.k));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public djg a(cpg $$0) {
      ic $$1 = $$0.k();
      ic $$2;
      if ($$1.o() == ic.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ic.b;
      }

      return this.o().a(b, ie.a($$1, $$2));
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhu($$0, $$1);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      dgu $$6 = $$1.c_($$2);
      if ($$6 instanceof dhu && $$3.gp()) {
         $$3.a((dhu)$$6);
         return bka.a($$1.B);
      } else {
         return bka.d;
      }
   }

   public static boolean a(edf.c $$0, edf.c $$1) {
      ic $$2 = h($$0.b());
      ic $$3 = h($$1.b());
      ic $$4 = n($$0.b());
      ic $$5 = n($$1.b());
      dhu.a $$6 = dhu.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dhu.a.b : dhu.a.a);
      boolean $$7 = $$6 == dhu.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ic h(djg $$0) {
      return $$0.c(b).a();
   }

   public static ic n(djg $$0) {
      return $$0.c(b).b();
   }
}
