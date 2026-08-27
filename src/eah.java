import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eah extends eam {
   private final je<dfc> e;
   public static final Codec<eah> a = RecordCodecBuilder.create($$0 -> a($$0).and(jp.a(li.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eah::new));

   public eah(jv $$0, je<dfc> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dtc $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eac<?> a() {
      return eac.a;
   }
}
