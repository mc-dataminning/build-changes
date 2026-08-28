import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqb extends dmf implements dtq {
   public static final MapCodec<dqb> a = b(dqb::new);
   private static final eay b = eax.I;
   private static final ffk c = dmf.b(12.0, 10.0, 16.0);

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   protected dqb(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(b) ? ewp.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      eah $$1 = super.a($$0);
      if ($$1 != null) {
         ewo $$2 = $$0.q().b_($$0.a());
         return $$1.b(b, Boolean.valueOf($$2.a() == ewp.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.d();
      eah $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, ja.a);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$4 == ja.b && !this.a($$0, $$1, $$3)) {
         return dmh.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, ewp.c, ewp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
