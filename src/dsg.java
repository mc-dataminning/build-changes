import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dsg implements drv {
   protected final jd f;

   protected static <P extends dsg> P1<Mu<P>, jd> a(Instance<P> $$0) {
      return $$0.group(jd.v(16).optionalFieldOf("offset", jd.g).forGetter($$0x -> $$0x.f));
   }

   protected dsg(jd $$0) {
      this.f = $$0;
   }

   public final boolean a(cwi $$0, hz $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dlf var1);
}
