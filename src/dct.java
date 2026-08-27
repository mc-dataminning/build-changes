import com.mojang.serialization.MapCodec;

public class dct extends cys implements dbk, dca {
   public static final MapCodec<dct> a = b(dct::new);
   public static final dmh<ih> b = dlz.T;

   @Override
   public MapCodec<dct> a() {
      return a;
   }

   protected dct(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.k));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dlj a(crk $$0) {
      ie $$1 = $$0.k();
      ie $$2;
      if ($$1.o() == ie.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ie.b;
      }

      return this.o().a(b, ih.a($$1, $$2));
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djx($$0, $$1);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      dix $$5 = $$1.c_($$2);
      if ($$5 instanceof djx && $$3.gq()) {
         $$3.a((djx)$$5);
         return blw.a($$1.B);
      } else {
         return blw.d;
      }
   }

   public static boolean a(efl.c $$0, efl.c $$1) {
      ie $$2 = m($$0.b());
      ie $$3 = m($$1.b());
      ie $$4 = n($$0.b());
      ie $$5 = n($$1.b());
      djx.a $$6 = djx.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? djx.a.b : djx.a.a);
      boolean $$7 = $$6 == djx.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ie m(dlj $$0) {
      return $$0.c(b).a();
   }

   public static ie n(dlj $$0) {
      return $$0.c(b).b();
   }
}
