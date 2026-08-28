import com.mojang.serialization.MapCodec;

public class djs extends dku {
   public static final MapCodec<djs> a = b(djs::new);

   @Override
   public MapCodec<? extends djs> a() {
      return a;
   }

   public djs(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dhp $$0, dym $$1, fcq $$2, crb $$3) {
      if (!$$0.C) {
         jj $$4 = $$2.b();
         $$0.a(null, $$4, awk.E, awl.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
