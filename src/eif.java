import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eif implements ehu {
   protected final ka f;

   protected static <P extends eif> P1<Mu<P>, ka> a(Instance<P> $$0) {
      return $$0.group(ka.v(16).optionalFieldOf("offset", ka.i).forGetter($$0x -> $$0x.f));
   }

   protected eif(ka $$0) {
      this.f = $$0;
   }

   public final boolean a(dkg $$0, iv $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(eao var1);
}
