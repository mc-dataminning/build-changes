import com.mojang.serialization.MapCodec;

public class dmg extends deu {
   public static final MapCodec<dmg> a = b(dmg::new);
   protected static final ewf b = deu.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   public dmg(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected ewf b_(drx $$0, daz $$1, iz $$2) {
      return ewc.b();
   }

   @Override
   protected ewf c(drx $$0, daz $$1, iz $$2, evr $$3) {
      return ewc.b();
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      dfa.b($$1, $$2.c(), $$0);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && $$2.a(dew.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Override
   protected float d(drx $$0, daz $$1, iz $$2) {
      return 0.2F;
   }
}
