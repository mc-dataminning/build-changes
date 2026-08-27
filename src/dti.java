import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dti implements dsx {
   protected final jf f;

   protected static <P extends dti> P1<Mu<P>, jf> a(Instance<P> $$0) {
      return $$0.group(jf.v(16).optionalFieldOf("offset", jf.g).forGetter($$0x -> $$0x.f));
   }

   protected dti(jf $$0) {
      this.f = $$0;
   }

   public final boolean a(cwz $$0, ib $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dme var1);
}
