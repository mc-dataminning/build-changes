import com.mojang.serialization.MapCodec;

public class duf extends dle {
   public static final MapCodec<duf> a = b(duf::new);
   private static final fdo b = dku.b(14.0, 0.0, 1.5);

   @Override
   public MapCodec<duf> a() {
      return a;
   }

   protected duf(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arn && $$3 instanceof csf) {
         $$1.a(new jj($$2), true, $$3);
      }
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      eut $$3 = $$1.b_($$2);
      eut $$4 = $$1.b_($$2.d());
      return ($$3.a() == euu.c || $$0.b() instanceof dov) && $$4.a() == euu.a;
   }
}
