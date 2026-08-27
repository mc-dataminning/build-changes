import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dpq implements dpf {
   protected final iz f;

   protected static <P extends dpq> P1<Mu<P>, iz> a(Instance<P> $$0) {
      return $$0.group(iz.v(16).optionalFieldOf("offset", iz.g).forGetter($$0x -> $$0x.f));
   }

   protected dpq(iz $$0) {
      this.f = $$0;
   }

   public final boolean a(ctt $$0, hv $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dip var1);
}
