import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dsi extends dsn {
   private final in<cys> e;
   public static final Codec<dsi> a = RecordCodecBuilder.create($$0 -> a($$0).and(ix.a(kg.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dsi::new));

   public dsi(jd $$0, in<cys> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dlj $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dsd<?> a() {
      return dsd.a;
   }
}
