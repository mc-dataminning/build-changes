import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eai extends eam {
   private final je<epd> e;
   public static final Codec<eai> a = RecordCodecBuilder.create($$0 -> a($$0).and(jp.a(li.z).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eai::new));

   public eai(jv $$0, je<epd> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dtc $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public eac<?> a() {
      return eac.c;
   }
}
