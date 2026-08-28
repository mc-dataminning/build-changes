import com.mojang.serialization.MapCodec;

public class dja extends dey implements dhq, dig {
   public static final MapCodec<dja> a = b(dja::new);
   public static final dsz<jg> b = dsr.T;

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   protected dja(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jg.k));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dsb a(cxz $$0) {
      je $$1 = $$0.k();
      je $$2;
      if ($$1.o() == je.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = je.b;
      }

      return this.o().a(b, jg.a($$1, $$2));
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqg($$0, $$1);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      dpg $$5 = $$1.c_($$2);
      if ($$5 instanceof dqg && $$3.gz()) {
         $$3.a((dqg)$$5);
         return bqt.a($$1.B);
      } else {
         return bqt.e;
      }
   }

   public static boolean a(emj.c $$0, emj.c $$1) {
      je $$2 = m($$0.b());
      je $$3 = m($$1.b());
      je $$4 = n($$0.b());
      je $$5 = n($$1.b());
      dqg.a $$6 = dqg.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dqg.a.b : dqg.a.a);
      boolean $$7 = $$6 == dqg.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static je m(dsb $$0) {
      return $$0.c(b).a();
   }

   public static je n(dsb $$0) {
      return $$0.c(b).b();
   }
}
