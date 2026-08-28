import com.mojang.serialization.MapCodec;

public class doc extends dfi {
   public static final MapCodec<doc> a = b(doc::new);
   protected static final ewk b = dez.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   protected doc(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arf && $$3 instanceof cov) {
         $$1.a(new iz($$2), true, $$3);
      }
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      env $$3 = $$1.b_($$2);
      env $$4 = $$1.b_($$2.c());
      return ($$3.a() == enw.c || $$0.b() instanceof dix) && $$4.a() == enw.a;
   }
}
