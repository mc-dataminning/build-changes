import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class dmd extends dqg implements dmi, dtq {
   public static final MapCodec<dmd> a = b(dmd::new);
   private static final eay b = eax.I;
   private static final Map<ja, ffk> c = ffh.c(dmf.b(6.0, 0.0, 16.0).a(0.0, 0.0, 0.25).d());

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   protected dmd(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(e, ja.c));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c.get($$0.c(e));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, e);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(b) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.e();
      eah $$4 = $$1.a_($$3);
      eah $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axc.bB)) && ($$5.a(this) || $$5.a(dmh.tn));
   }

   protected static boolean a(djb $$0, iu $$1, ewo $$2, ja $$3) {
      eah $$4 = dmh.to.m().b(b, Boolean.valueOf($$2.a(ewp.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if (($$4 == ja.a || $$4 == ja.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(b)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      Optional<iu> $$3 = l.a($$0, $$1, $$2.b(), ja.b, dmh.tn);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iu $$4 = $$3.get().d();
         eah $$5 = $$0.a_($$4);
         return dmc.a((djc)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      Optional<iu> $$4 = l.a($$0, $$2, $$3.b(), ja.b, dmh.tn);
      if (!$$4.isEmpty()) {
         iu $$5 = $$4.get();
         iu $$6 = $$5.d();
         ja $$7 = $$3.c(e);
         a($$0, $$5, $$0.b_($$5), $$7);
         dmc.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd(dmh.tn);
   }
}
