import com.mojang.serialization.MapCodec;

public class dgh extends djp {
   public static final MapCodec<dgh> a = b(dgh::new);

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   public dgh(dsg.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         ja $$4 = $$2.d();
         dsh $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), jf.b)) {
            ayi.a($$1, $$2, $$3, lj.H);
         }
      }
   }
}
