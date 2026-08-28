import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqr extends dmf implements dtq {
   public static final MapCodec<dqr> a = b(dqr::new);
   public static final eay b = eax.m;
   public static final eay c = eax.I;
   private static final ffk d = ffh.a(dmf.b(4.0, 7.0, 9.0), dmf.b(6.0, 0.0, 7.0));
   private static final ffk e = d.a(0.0, 0.0625, 0.0).d();

   @Override
   public MapCodec<dqr> a() {
      return a;
   }

   public dqr(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());

      for (ja $$2 : $$0.f()) {
         if ($$2.o() == ja.a.b) {
            eah $$3 = this.m().b(b, Boolean.valueOf($$2 == ja.b));
            if ($$3.a((djd)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == ewp.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      ja $$3 = o($$0).g();
      return dmf.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ja o(eah $$0) {
      return $$0.c(b) ? ja.a : ja.b;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(c) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
