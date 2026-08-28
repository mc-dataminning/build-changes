import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqu extends dlt implements djn, dqq {
   public static final MapCodec<dqu> c = b(dqu::new);
   private static final dxm g = dxl.J;
   public static final dxs<jn> d = dxl.U;
   protected static final float e = 6.0F;
   protected static final fbs f = djk.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqu> a() {
      return c;
   }

   public dqu(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxq.b).b(g, Boolean.valueOf(false)).b(d, jn.c));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return f;
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.a(awo.bz) || $$1.b_($$2.d()).a(esy.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dwv $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, bvf $$3, cwn $$4) {
      if (!$$0.B_()) {
         ji $$5 = $$1.d();
         dwv $$6 = dlt.b($$0, $$5, this.m().b(b, dxq.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(g) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      if ($$0.c(b) == dxq.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ji $$3 = $$2.e();
         dwv $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return true;
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      if ($$3.c(dlt.b) == dxq.b) {
         ji $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         djh.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ji $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
