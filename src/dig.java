import com.mojang.serialization.MapCodec;

public class dig extends dky implements dif {
   public static final MapCodec<dig> c = b(dig::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dig> a() {
      return c;
   }

   public dig(dun.d $$0) {
      super($$0, jj.a, u_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(v_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azl $$0) {
      return 1;
   }

   @Override
   protected boolean h(duo $$0) {
      return $$0.l();
   }

   @Override
   protected dhj b() {
      return dhl.sw;
   }

   @Override
   protected duo a(duo $$0, duo $$1) {
      return $$1.b(v_, $$0.c(v_));
   }

   @Override
   protected duo a(duo $$0, azl $$1) {
      return super.a($$0, $$1).b(v_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp(cvt.wy);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      return dif.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      super.a($$0);
      $$0.a(v_);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return !$$2.c(v_);
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      $$0.a($$2, $$3.b(v_, Boolean.valueOf(true)), 2);
   }
}
