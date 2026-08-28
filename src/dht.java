import com.mojang.serialization.MapCodec;

public class dht extends dkj implements dhr {
   public static final MapCodec<dht> c = b(dht::new);

   @Override
   public MapCodec<dht> a() {
      return c;
   }

   public dht(dtz.d $$0) {
      super($$0, jj.a, u_, false);
      this.l(this.E.b().b(v_, Boolean.valueOf(false)));
   }

   @Override
   protected dkk c() {
      return (dkk)dgx.sv;
   }

   @Override
   protected dua a(dua $$0, dua $$1) {
      return $$1.b(v_, $$0.c(v_));
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl(cvo.wy);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      return dhr.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(v_);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return !$$2.c(v_);
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      $$0.a($$2, $$3.b(v_, Boolean.valueOf(true)), 2);
   }
}
