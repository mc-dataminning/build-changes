import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eiv implements eik {
   protected final ka f;

   protected static <P extends eiv> P1<Mu<P>, ka> a(Instance<P> $$0) {
      return $$0.group(ka.v(16).optionalFieldOf("offset", ka.i).forGetter($$0x -> $$0x.f));
   }

   protected eiv(ka $$0) {
      this.f = $$0;
   }

   public final boolean a(dkw $$0, iv $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(ebe var1);
}
