import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dqq extends dmf implements dtq {
   public static final MapCodec<dqq> a = b(dqq::new);
   public static final ebf<ja> b = dqg.e;
   public static final eay c = eax.I;
   public static final Map<ja, ffk> d = ffh.c(dmf.c(16.0, 13.0, 16.0));

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   protected dqq(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return d.get($$0.c(b));
   }

   private boolean a(dig $$0, iu $$1, ja $$2) {
      eah $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      ja $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dmh.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, ewp.c, ewp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      if (!$$0.c()) {
         eah $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      eah $$2 = this.m();
      djd $$3 = $$0.q();
      iu $$4 = $$0.a();
      ewo $$5 = $$0.q().b_($$0.a());

      for (ja $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == ewp.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(c) ? ewp.c.a(false) : super.b_($$0);
   }
}
