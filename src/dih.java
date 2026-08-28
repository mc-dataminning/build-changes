import com.mojang.serialization.MapCodec;

public class dih extends dkx implements dif {
   public static final MapCodec<dih> c = b(dih::new);

   @Override
   public MapCodec<dih> a() {
      return c;
   }

   public dih(dun.d $$0) {
      super($$0, jj.a, u_, false);
      this.l(this.F.b().b(v_, Boolean.valueOf(false)));
   }

   @Override
   protected dky c() {
      return (dky)dhl.sv;
   }

   @Override
   protected duo a(duo $$0, duo $$1) {
      return $$1.b(v_, $$0.c(v_));
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
