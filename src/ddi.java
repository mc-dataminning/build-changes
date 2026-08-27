import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddi extends dcq {
   public static final MapCodec<ddi> a = b(ddi::new);
   public static final dqy[] b = new dqy[]{dqx.k, dqx.l, dqx.m};
   protected static final eui c = euf.a(dde.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dde.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<ddi> a() {
      return a;
   }

   public ddi(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dnp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return $$0.B ? null : a($$2, dno.l, dnp::a);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         dnm $$5 = $$1.c_($$2);
         if ($$5 instanceof dnp) {
            $$3.a((dnp)$$5);
            $$3.a(avm.aa);
         }

         return bpm.b;
      }
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(kx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      bpi.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return cod.a($$1.c_($$2));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
