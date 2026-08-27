import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dqm extends dqq {
   private final il<eey> e;
   public static final Codec<dqm> a = RecordCodecBuilder.create($$0 -> a($$0).and(iv.a(ke.y).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dqm::new));

   public dqm(jb $$0, il<eey> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(djp $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dqg<?> a() {
      return dqg.c;
   }
}
