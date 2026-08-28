import com.mojang.serialization.MapCodec;

public class dds extends deu {
   public static final MapCodec<dds> a = b(dds::new);

   @Override
   public MapCodec<? extends dds> a() {
      return a;
   }

   public dds(drw.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dbt $$0, drx $$1, evi $$2, cnk $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         $$0.a(null, $$4, avw.G, avx.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, avw.E, avx.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
