import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class diy extends djc {
   private final hi<dxd> e;
   public static final Codec<diy> a = RecordCodecBuilder.create($$0 -> a($$0).and(ht.a(jc.w).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, diy::new));

   public diy(hz $$0, hi<dxd> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dcb $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dis<?> a() {
      return dis.c;
   }
}
