import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dxr implements dxg {
   protected final jr f;

   protected static <P extends dxr> P1<Mu<P>, jr> a(Instance<P> $$0) {
      return $$0.group(jr.v(16).optionalFieldOf("offset", jr.g).forGetter($$0x -> $$0x.f));
   }

   protected dxr(jr $$0) {
      this.f = $$0;
   }

   public final boolean a(day $$0, in $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dqh var1);
}
