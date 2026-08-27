import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqk extends dqq {
   final asx<cwy> a;
   public static final Codec<dqk> e = RecordCodecBuilder.create($$0 -> a($$0).and(asx.a(ke.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dqk::new));

   protected dqk(jb $$0, asx<cwy> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(djp $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dqg<?> a() {
      return dqg.b;
   }
}
