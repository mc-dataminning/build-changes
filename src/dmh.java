import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmh extends dmm {
   private final hk<csx> e;
   public static final Codec<dmh> a = RecordCodecBuilder.create($$0 -> a($$0).and(hv.a(je.e).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dmh::new));

   public dmh(ib $$0, hk<csx> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dfl $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dmc<?> a() {
      return dmc.a;
   }
}
