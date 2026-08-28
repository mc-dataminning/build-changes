import com.mojang.serialization.MapCodec;

public class dpz extends dlu implements don, dpe {
   public static final MapCodec<dpz> a = b(dpz::new);
   public static final eam<jc> b = eae.W;

   @Override
   public MapCodec<dpz> a() {
      return a;
   }

   protected dpz(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jc.k));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dzo a(dcl $$0) {
      ja $$1 = $$0.k();
      ja $$2;
      if ($$1.o() == ja.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ja.b;
      }

      return this.m().b(b, jc.a($$1, $$2));
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxr($$0, $$1);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      dwn $$5 = $$1.c_($$2);
      if ($$5 instanceof dxr && $$3.gF()) {
         $$3.a((dxr)$$5);
         return bty.a;
      } else {
         return bty.e;
      }
   }

   public static boolean a(euk.a $$0, euk.a $$1) {
      ja $$2 = o($$0.a().b());
      ja $$3 = o($$1.a().b());
      ja $$4 = p($$0.a().b());
      ja $$5 = p($$1.a().b());
      dxr.a $$6 = $$0.b();
      boolean $$7 = $$6 == dxr.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static ja o(dzo $$0) {
      return $$0.c(b).a();
   }

   public static ja p(dzo $$0) {
      return $$0.c(b).b();
   }
}
