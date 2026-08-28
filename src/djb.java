import com.mojang.serialization.MapCodec;

public class djb extends dls implements dja {
   public static final MapCodec<djb> c = b(djb::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<djb> a() {
      return c;
   }

   public djb(dvi.d $$0) {
      super($$0, jm.a, u_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(v_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azs $$0) {
      return 1;
   }

   @Override
   protected boolean h(dvj $$0) {
      return $$0.l();
   }

   @Override
   protected die b() {
      return dig.sw;
   }

   @Override
   protected dvj a(dvj $$0, dvj $$1) {
      return $$1.b(v_, $$0.c(v_));
   }

   @Override
   protected dvj a(dvj $$0, azs $$1) {
      return super.a($$0, $$1).b(v_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb(cwf.wy);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      return dja.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      super.a($$0);
      $$0.a(v_);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return !$$2.c(v_);
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      $$0.a($$2, $$3.b(v_, Boolean.valueOf(true)), 2);
   }
}
