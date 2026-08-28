import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dic extends dhk {
   public static final MapCodec<dic> a = b(dic::new);
   public static final dvu[] b = new dvu[]{dvt.k, dvt.l, dvt.m};
   protected static final fab c = ezy.a(dhy.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dhy.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   public dic(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dsj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return $$0.C ? null : a($$2, dsi.l, dsj::a);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dsj $$5) {
         $$3.a($$5);
         $$3.a(awu.aa);
      }

      return bry.a;
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lq.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      bru.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return crj.a($$1.c_($$2));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
