import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtu extends doo implements dmi, dtq {
   public static final MapCodec<dtu> c = b(dtu::new);
   private static final eay e = eax.I;
   public static final ebf<ja> d = eax.T;
   private static final ffk f = dmf.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dtu> a() {
      return c;
   }

   public dtu(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ebd.b).b(e, Boolean.valueOf(false)).b(d, ja.c));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return f;
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.a(axc.bA) || $$1.b_($$2.d()).a(ewp.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      eah $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, bxe $$3, czd $$4) {
      if (!$$0.w_()) {
         iu $$5 = $$1.d();
         eah $$6 = doo.b($$0, $$5, this.m().b(b, ebd.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(e) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      if ($$0.c(b) == ebd.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iu $$3 = $$2.e();
         eah $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, e, d);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return true;
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      if ($$3.c(doo.b) == ebd.b) {
         iu $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dmc.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iu $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float aq_() {
      return 0.1F;
   }
}
