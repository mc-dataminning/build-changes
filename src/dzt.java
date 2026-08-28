import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzt extends dzy {
   private final jn<dfi> e;
   public static final MapCodec<dzt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jy.a(lr.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dzt::new)
   );

   public dzt(ke $$0, jn<dfi> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsl $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dzo<?> a() {
      return dzo.a;
   }
}
