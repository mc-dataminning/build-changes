import com.mojang.serialization.MapCodec;

public class dmc extends dne {
   public static final MapCodec<dmc> a = b(dmc::new);

   @Override
   public MapCodec<? extends dmc> a() {
      return a;
   }

   public dmc(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected void a(djz $$0, ebg $$1, ffo $$2, csu $$3) {
      if (!$$0.C) {
         iw $$4 = $$2.b();
         $$0.a(null, $$4, awr.E, aws.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
