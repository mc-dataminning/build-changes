import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dwe extends dwj {
   private final ip<dby> e;
   public static final Codec<dwe> a = RecordCodecBuilder.create($$0 -> a($$0).and(ja.a(ks.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dwe::new));

   public dwe(jg $$0, ip<dby> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(doz $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dvz<?> a() {
      return dvz.a;
   }
}
