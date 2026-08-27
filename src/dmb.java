import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmb extends dmf {
   private final hk<eag> e;
   public static final Codec<dmb> a = RecordCodecBuilder.create($$0 -> a($$0).and(hv.a(je.w).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dmb::new));

   public dmb(ib $$0, hk<eag> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dfe $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dlv<?> a() {
      return dlv.c;
   }
}
