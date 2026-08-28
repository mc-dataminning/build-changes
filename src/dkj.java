import com.mojang.serialization.MapCodec;

public class dkj extends dnb implements dki {
   public static final MapCodec<dkj> c = b(dkj::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dkj> a() {
      return c;
   }

   public dkj(dwv.d $$0) {
      super($$0, jn.a, s_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Override
   protected boolean h(dww $$0) {
      return $$0.l();
   }

   @Override
   protected djl b() {
      return djn.sY;
   }

   @Override
   protected dww a(dww $$0, dww $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected dww a(dww $$0, azh $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo(cws.xw);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      return dki.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
