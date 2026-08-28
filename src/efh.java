import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class efh implements eew {
   protected final kl f;

   protected static <P extends efh> P1<Mu<P>, kl> a(Instance<P> $$0) {
      return $$0.group(kl.v(16).optionalFieldOf("offset", kl.g).forGetter($$0x -> $$0x.f));
   }

   protected efh(kl $$0) {
      this.f = $$0;
   }

   public final boolean a(dif $$0, jh $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dxu var1);
}
