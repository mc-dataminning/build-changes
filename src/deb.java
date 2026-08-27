import com.mojang.serialization.MapCodec;

public class deb extends daa implements dcs, ddi {
   public static final MapCodec<deb> a = b(deb::new);
   public static final dnx<ij> b = dnp.T;

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   protected deb(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.k));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dmz a(css $$0) {
      ih $$1 = $$0.k();
      ih $$2;
      if ($$1.o() == ih.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ih.b;
      }

      return this.o().a(b, ij.a($$1, $$2));
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlg($$0, $$1);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      dkg $$5 = $$1.c_($$2);
      if ($$5 instanceof dlg && $$3.gw()) {
         $$3.a((dlg)$$5);
         return bnc.a($$1.B);
      } else {
         return bnc.d;
      }
   }

   public static boolean a(ehc.c $$0, ehc.c $$1) {
      ih $$2 = m($$0.b());
      ih $$3 = m($$1.b());
      ih $$4 = n($$0.b());
      ih $$5 = n($$1.b());
      dlg.a $$6 = dlg.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dlg.a.b : dlg.a.a);
      boolean $$7 = $$6 == dlg.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ih m(dmz $$0) {
      return $$0.c(b).a();
   }

   public static ih n(dmz $$0) {
      return $$0.c(b).b();
   }
}
