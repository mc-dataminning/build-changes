import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhn extends dgv {
   public static final MapCodec<dhn> a = b(dhn::new);
   public static final dvf[] b = new dvf[]{dve.k, dve.l, dve.m};
   protected static final ezm c = ezj.a(dhj.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dhj.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   public dhn(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new drv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return $$0.B ? null : a($$2, dru.l, drv::a);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof drv $$5) {
         $$3.a($$5);
         $$3.a(awo.aa);
      }

      return brp.a;
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ln.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      brl.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return cqw.a($$1.c_($$2));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
