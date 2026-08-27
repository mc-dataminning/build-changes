import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class due implements dtt {
   protected final jg f;

   protected static <P extends due> P1<Mu<P>, jg> a(Instance<P> $$0) {
      return $$0.group(jg.v(16).optionalFieldOf("offset", jg.g).forGetter($$0x -> $$0x.f));
   }

   protected due(jg $$0) {
      this.f = $$0;
   }

   public final boolean a(cxu $$0, ib $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dmz var1);
}
