import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkz extends dkg {
   public static final MapCodec<dkz> a = b(dkz::new);
   public static final dzd[] b = new dzd[]{dzc.n, dzc.o, dzc.p};
   private static final fdo c = fdl.a(dku.b(2.0, 2.0, 14.0), dku.b(14.0, 0.0, 2.0));

   @Override
   public MapCodec<dkz> a() {
      return a;
   }

   public dkz(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return $$0.C ? null : a($$2, dvn.m, dvp::a);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c;
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvp $$5) {
         $$3.a($$5);
         $$3.a(awu.aa);
      }

      return btq.a;
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lv.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      btm.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return ctn.a($$1.c_($$2));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
