import com.mojang.serialization.MapCodec;

public class diw extends dll implements diu {
   public static final MapCodec<diw> c = b(diw::new);

   @Override
   public MapCodec<diw> a() {
      return c;
   }

   public diw(dvc.d $$0) {
      super($$0, jl.a, u_, false);
      this.l(this.F.b().b(v_, Boolean.valueOf(false)));
   }

   @Override
   protected dlm c() {
      return (dlm)dia.sv;
   }

   @Override
   protected dvd a(dvd $$0, dvd $$1) {
      return $$1.b(v_, $$0.c(v_));
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx(cwb.wy);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      return diu.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(v_);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return !$$2.c(v_);
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      $$0.a($$2, $$3.b(v_, Boolean.valueOf(true)), 2);
   }
}
