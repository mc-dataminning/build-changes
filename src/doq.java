import com.mojang.serialization.MapCodec;

public class doq extends dkm implements dng, dnv {
   public static final MapCodec<doq> a = b(doq::new);
   public static final dys<jo> b = dyl.U;

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   protected doq(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jo.k));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dxv a(dbg $$0) {
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
   public dux a(jh $$0, dxv $$1) {
      return new dwa($$0, $$1);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      dux $$5 = $$1.c_($$2);
      if ($$5 instanceof dwa && $$3.gG()) {
         $$3.a((dwa)$$5);
         return btj.a;
      } else {
         return btj.e;
      }
   }

   public static boolean a(esm.a $$0, esm.a $$1) {
      jm $$2 = o($$0.a().b());
      jm $$3 = o($$1.a().b());
      jm $$4 = p($$0.a().b());
      jm $$5 = p($$1.a().b());
      dwa.a $$6 = $$0.b();
      boolean $$7 = $$6 == dwa.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jm o(dxv $$0) {
      return $$0.c(b).a();
   }

   public static jm p(dxv $$0) {
      return $$0.c(b).b();
   }
}
