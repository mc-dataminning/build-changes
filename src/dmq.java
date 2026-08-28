import com.mojang.serialization.MapCodec;

public class dmq extends dhy {
   public static final MapCodec<dmq> a = b(dmq::new);
   private static final int b = 20;

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   public dmq(dvc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, btz $$3) {
      if (!$$3.cf() && $$3 instanceof buv) {
         $$3.a($$0.ak().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      die.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == jl.b && $$2.a(dia.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
