import com.mojang.serialization.MapCodec;

public class ded extends dac implements dcu, ddk {
   public static final MapCodec<ded> a = b(ded::new);
   public static final dnz<ij> b = dnr.T;

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   protected ded(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.k));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dnb a(csu $$0) {
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
   public dki a(ib $$0, dnb $$1) {
      return new dli($$0, $$1);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      dki $$5 = $$1.c_($$2);
      if ($$5 instanceof dli && $$3.gw()) {
         $$3.a((dli)$$5);
         return bnd.a($$1.B);
      } else {
         return bnd.d;
      }
   }

   public static boolean a(ehe.c $$0, ehe.c $$1) {
      ih $$2 = m($$0.b());
      ih $$3 = m($$1.b());
      ih $$4 = n($$0.b());
      ih $$5 = n($$1.b());
      dli.a $$6 = dli.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dli.a.b : dli.a.a);
      boolean $$7 = $$6 == dli.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ih m(dnb $$0) {
      return $$0.c(b).a();
   }

   public static ih n(dnb $$0) {
      return $$0.c(b).b();
   }
}
