import com.mojang.serialization.MapCodec;

public class dds extends dac {
   public static final MapCodec<dds> d = b(dds::new);

   @Override
   protected MapCodec<? extends dds> a() {
      return d;
   }

   protected dds(dna.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dnb $$0, dnb $$1, ih $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
