import com.mojang.serialization.MapCodec;

public class djo extends dac {
   public static final MapCodec<djo> a = b(djo::new);

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   public djo(dna.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      $$3.a($$0, new ept(0.25, 0.05F, 0.25));
   }
}
