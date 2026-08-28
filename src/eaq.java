import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eaq implements eaf {
   protected final kh f;

   protected static <P extends eaq> P1<Mu<P>, kh> a(Instance<P> $$0) {
      return $$0.group(kh.v(16).optionalFieldOf("offset", kh.g).forGetter($$0x -> $$0x.f));
   }

   protected eaq(kh $$0) {
      this.f = $$0;
   }

   public final boolean a(dds $$0, jd $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dtc var1);
}
