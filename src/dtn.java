import com.mojang.serialization.MapCodec;

public class dtn extends dko {
   public static final MapCodec<dtn> a = b(dtn::new);
   private static final fcr b = dke.b(14.0, 0.0, 1.5);

   @Override
   public MapCodec<dtn> a() {
      return a;
   }

   protected dtn(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof ard && $$3 instanceof cro) {
         $$1.a(new ji($$2), true, $$3);
      }
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      etw $$3 = $$1.b_($$2);
      etw $$4 = $$1.b_($$2.d());
      return ($$3.a() == etx.c || $$0.b() instanceof dof) && $$4.a() == etx.a;
   }
}
