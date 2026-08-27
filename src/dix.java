import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dix extends djc {
   private final hi<cpn> e;
   public static final Codec<dix> a = RecordCodecBuilder.create($$0 -> a($$0).and(ht.a(jc.e).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dix::new));

   public dix(hz $$0, hi<cpn> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dcb $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dis<?> a() {
      return dis.a;
   }
}
