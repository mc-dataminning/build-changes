import com.mojang.serialization.MapCodec;

public class cxc extends ctc implements cvs, cwi {
   public static final MapCodec<cxc> a = b(cxc::new);
   public static final dgb<hc> b = dft.T;

   @Override
   public MapCodec<cxc> a() {
      return a;
   }

   protected cxc(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hc.k));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dfd a(clt $$0) {
      ha $$1 = $$0.k();
      ha $$2;
      if ($$1.o() == ha.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ha.b;
      }

      return this.o().a(b, hc.a($$1, $$2));
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddy($$0, $$1);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      dcz $$6 = $$1.c_($$2);
      if ($$6 instanceof ddy && $$3.gp()) {
         $$3.a((ddy)$$6);
         return bhe.a($$1.B);
      } else {
         return bhe.d;
      }
   }

   public static boolean a(dyv.c $$0, dyv.c $$1) {
      ha $$2 = h($$0.b());
      ha $$3 = h($$1.b());
      ha $$4 = n($$0.b());
      ha $$5 = n($$1.b());
      ddy.a $$6 = ddy.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? ddy.a.b : ddy.a.a);
      boolean $$7 = $$6 == ddy.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ha h(dfd $$0) {
      return $$0.c(b).a();
   }

   public static ha n(dfd $$0) {
      return $$0.c(b).b();
   }
}
