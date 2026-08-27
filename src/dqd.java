import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dqd extends dqh {
   private final il<eep> e;
   public static final Codec<dqd> a = RecordCodecBuilder.create($$0 -> a($$0).and(iv.a(ke.y).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dqd::new));

   public dqd(jb $$0, il<eep> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(djg $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dpx<?> a() {
      return dpx.c;
   }
}
