import com.mojang.serialization.MapCodec;

public class djc extends dlr implements dja {
   public static final MapCodec<djc> c = b(djc::new);

   @Override
   public MapCodec<djc> a() {
      return c;
   }

   public djc(dvi.d $$0) {
      super($$0, jm.a, u_, false);
      this.l(this.F.b().b(v_, Boolean.valueOf(false)));
   }

   @Override
   protected dls c() {
      return (dls)dig.sv;
   }

   @Override
   protected dvj a(dvj $$0, dvj $$1) {
      return $$1.b(v_, $$0.c(v_));
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
