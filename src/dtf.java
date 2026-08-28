import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtf extends dod implements dlx, dtb {
   public static final MapCodec<dtf> c = b(dtf::new);
   private static final eaf e = eae.I;
   public static final eam<ja> d = eae.T;
   private static final feq f = dlu.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dtf> a() {
      return c;
   }

   public dtf(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, eak.b).b(e, Boolean.valueOf(false)).b(d, ja.c));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return f;
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.a(axa.bz) || $$1.b_($$2.d()).a(evw.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, bwz $$3, cys $$4) {
      if (!$$0.w_()) {
         iu $$5 = $$1.d();
         dzo $$6 = dod.b($$0, $$5, this.m().b(b, eak.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(e) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      if ($$0.c(b) == eak.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iu $$3 = $$2.e();
         dzo $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, e, d);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return true;
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      if ($$3.c(dod.b) == eak.b) {
         iu $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dlr.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iu $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float ap_() {
      return 0.1F;
   }
}
