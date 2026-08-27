import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class djc implements dir {
   protected final hz f;

   protected static <P extends djc> P1<Mu<P>, hz> a(Instance<P> $$0) {
      return $$0.group(hz.v(16).optionalFieldOf("offset", hz.g).forGetter($$0x -> $$0x.f));
   }

   protected djc(hz $$0) {
      this.f = $$0;
   }

   public final boolean a(cng $$0, gu $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dcb var1);
}
