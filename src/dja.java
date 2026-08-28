import com.mojang.serialization.MapCodec;

public class dja extends dmh {
   public static final MapCodec<dja> a = b(dja::new);

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   public dja(dvc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         jg $$4 = $$2.e();
         dvd $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jl.b)) {
            azn.a($$1, $$2, $$3, lq.H);
         }
      }
   }
}
