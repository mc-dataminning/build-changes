import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkq extends djx {
   public static final MapCodec<dkq> a = b(dkq::new);
   public static final dyl[] b = new dyl[]{dyk.k, dyk.l, dyk.m};
   protected static final fcr c = fco.a(dkl.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dkl.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   public dkq(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new duz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return $$0.C ? null : a($$2, duy.m, duz::a);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c;
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof duz $$5) {
         $$3.a($$5);
         $$3.a(axp.aa);
      }

      return bti.a;
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ls.af, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      bte.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return ctb.a($$1.c_($$2));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
