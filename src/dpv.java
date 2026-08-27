import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpv extends dqb {
   final asq<cwj> a;
   public static final Codec<dpv> e = RecordCodecBuilder.create($$0 -> a($$0).and(asq.a(ke.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dpv::new));

   protected dpv(jb $$0, asq<cwj> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dja $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dpr<?> a() {
      return dpr.b;
   }
}
