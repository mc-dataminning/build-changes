import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class ecc implements ebr {
   protected final ki f;

   protected static <P extends ecc> P1<Mu<P>, ki> a(Instance<P> $$0) {
      return $$0.group(ki.v(16).optionalFieldOf("offset", ki.g).forGetter($$0x -> $$0x.f));
   }

   protected ecc(ki $$0) {
      this.f = $$0;
   }

   public final boolean a(dfd $$0, je $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(duo var1);
}
