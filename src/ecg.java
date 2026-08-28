import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class ecg implements ebv {
   protected final kj f;

   protected static <P extends ecg> P1<Mu<P>, kj> a(Instance<P> $$0) {
      return $$0.group(kj.v(16).optionalFieldOf("offset", kj.g).forGetter($$0x -> $$0x.f));
   }

   protected ecg(kj $$0) {
      this.f = $$0;
   }

   public final boolean a(dfg $$0, jf $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dus var1);
}
