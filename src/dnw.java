import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnw extends djn implements dqt {
   public static final MapCodec<dnw> a = b(dnw::new);
   public static final dxp b = dxo.n;
   public static final dxp c = dxo.J;
   protected static final fbv d = fbs.a(djn.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), djn.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final fbv e = fbs.a(djn.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), djn.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());

      for (jn $$2 : $$0.f()) {
         if ($$2.o() == jn.a.b) {
            dwy $$3 = this.m().b(b, Boolean.valueOf($$2 == jn.b));
            if ($$3.a((dgm)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == etb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      jn $$3 = o($$0).g();
      return djn.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jn o(dwy $$0) {
      return $$0.c(b) ? jn.a : jn.b;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(c) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
