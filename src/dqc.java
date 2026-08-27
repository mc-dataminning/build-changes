import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dqc extends dqh {
   private final il<cwp> e;
   public static final Codec<dqc> a = RecordCodecBuilder.create($$0 -> a($$0).and(iv.a(ke.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dqc::new));

   public dqc(jb $$0, il<cwp> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(djg $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dpx<?> a() {
      return dpx.a;
   }
}
