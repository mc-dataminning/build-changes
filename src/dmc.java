import com.mojang.serialization.MapCodec;

public class dmc extends dhj {
   public static final MapCodec<dmc> a = b(dmc::new);
   private static final int b = 20;

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   public dmc(dun.d $$0) {
      super($$0);
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, bto $$3) {
      if (!$$3.cb() && $$3 instanceof buk) {
         $$3.a($$0.ak().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      dhp.b($$1, $$2.d(), $$0);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == jj.b && $$2.a(dhl.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
