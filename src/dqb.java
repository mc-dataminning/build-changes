import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqb extends dqh {
   final asv<cwp> a;
   public static final Codec<dqb> e = RecordCodecBuilder.create($$0 -> a($$0).and(asv.a(ke.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dqb::new));

   protected dqb(jb $$0, asv<cwp> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(djg $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dpx<?> a() {
      return dpx.b;
   }
}
