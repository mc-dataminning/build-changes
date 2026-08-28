import com.mojang.serialization.MapCodec;

public class dni extends diq {
   public static final MapCodec<dni> a = b(dni::new);
   private static final int b = 20;

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(dvu.d $$0) {
      super($$0);
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bul $$3) {
      if (!$$3.ce() && $$3 instanceof bvh) {
         $$3.a($$0.ai().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      diw.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4 == jm.b && $$6.a(dis.G)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
