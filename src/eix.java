import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eix implements eim {
   protected final kb f;

   protected static <P extends eix> P1<Mu<P>, kb> a(Instance<P> $$0) {
      return $$0.group(kb.v(16).optionalFieldOf("offset", kb.i).forGetter($$0x -> $$0x.f));
   }

   protected eix(kb $$0) {
      this.f = $$0;
   }

   public final boolean a(dky $$0, iw $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(ebg var1);
}
