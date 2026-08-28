import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dzo implements dzd {
   protected final kd f;

   protected static <P extends dzo> P1<Mu<P>, kd> a(Instance<P> $$0) {
      return $$0.group(kd.v(16).optionalFieldOf("offset", kd.g).forGetter($$0x -> $$0x.f));
   }

   protected dzo(kd $$0) {
      this.f = $$0;
   }

   public final boolean a(dcv $$0, iz $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dse var1);
}
