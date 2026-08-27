import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dws implements dwh {
   protected final ji f;

   protected static <P extends dws> P1<Mu<P>, ji> a(Instance<P> $$0) {
      return $$0.group(ji.v(16).optionalFieldOf("offset", ji.g).forGetter($$0x -> $$0x.f));
   }

   protected dws(ji $$0) {
      this.f = $$0;
   }

   public final boolean a(dab $$0, id $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dpi var1);
}
