import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dsb extends dsg {
   private final in<cyo> e;
   public static final Codec<dsb> a = RecordCodecBuilder.create($$0 -> a($$0).and(ix.a(kg.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dsb::new));

   public dsb(jd $$0, in<cyo> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dlf $$0) {
      return $$0.a(this.e);
   }

   @Override
   public drw<?> a() {
      return drw.a;
   }
}
