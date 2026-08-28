import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class ecr implements ecg {
   protected final kk f;

   protected static <P extends ecr> P1<Mu<P>, kk> a(Instance<P> $$0) {
      return $$0.group(kk.v(16).optionalFieldOf("offset", kk.g).forGetter($$0x -> $$0x.f));
   }

   protected ecr(kk $$0) {
      this.f = $$0;
   }

   public final boolean a(dfs $$0, jg $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dvd var1);
}
