import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dql extends dqq {
   private final il<cwy> e;
   public static final Codec<dql> a = RecordCodecBuilder.create($$0 -> a($$0).and(iv.a(ke.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dql::new));

   public dql(jb $$0, il<cwy> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(djp $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dqg<?> a() {
      return dqg.a;
   }
}
