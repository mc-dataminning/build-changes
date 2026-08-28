import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eek implements edz {
   protected final km f;

   protected static <P extends eek> P1<Mu<P>, km> a(Instance<P> $$0) {
      return $$0.group(km.v(16).optionalFieldOf("offset", km.h).forGetter($$0x -> $$0x.f));
   }

   protected eek(km $$0) {
      this.f = $$0;
   }

   public final boolean a(dhg $$0, ji $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dwx var1);
}
