import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dlw extends dmb {
   private final hi<csm> e;
   public static final Codec<dlw> a = RecordCodecBuilder.create($$0 -> a($$0).and(ht.a(jc.e).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dlw::new));

   public dlw(hz $$0, hi<csm> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dfa $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dlr<?> a() {
      return dlr.a;
   }
}
