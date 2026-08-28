import com.mojang.serialization.MapCodec;

public class dfz extends djh {
   public static final MapCodec<dfz> a = b(dfz::new);

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   public dfz(drz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         iz $$4 = $$2.d();
         dsa $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), je.b)) {
            azb.a($$1, $$2, $$3, li.H);
         }
      }
   }
}
