import com.mojang.serialization.MapCodec;

public class dkk extends dnc implements dkj {
   public static final MapCodec<dkk> c = b(dkk::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dkk> a() {
      return c;
   }

   public dkk(dww.d $$0) {
      super($$0, jn.a, s_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Override
   protected boolean h(dwx $$0) {
      return $$0.l();
   }

   @Override
   protected djm b() {
      return djo.sY;
   }

   @Override
   protected dwx a(dwx $$0, dwx $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected dwx a(dwx $$0, azh $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp(cwt.xw);
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      return dkj.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
