import com.mojang.serialization.MapCodec;

public class dnn extends die implements dih {
   public static final MapCodec<dnn> a = b(dnn::new);

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   protected dnn(dvi.d $$0) {
      super($$0);
   }

   private static boolean b(dvj $$0, dfe $$1, jh $$2) {
      jh $$3 = $$2.d();
      dvj $$4 = $$1.a_($$3);
      int $$5 = erb.a($$0, $$4, jm.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dig.dV.m());
      }
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      dvj $$4 = $$0.a_($$2);
      jh $$5 = $$2.d();
      dxg $$6 = $$0.l().g();
      kd<edx<?, ?>> $$7 = $$0.H_().e(lz.aJ);
      if ($$4.a(dig.ow)) {
         this.a($$7, sb.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dig.on)) {
         this.a($$7, sb.j, $$0, $$6, $$1, $$5);
         this.a($$7, sb.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, sb.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(kd<edx<?, ?>> $$0, alh<edx<?, ?>> $$1, arn $$2, dxg $$3, azs $$4, jh $$5) {
      $$0.a($$1).ifPresent($$4x -> ((edx)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dih.a ar_() {
      return dih.a.a;
   }
}
