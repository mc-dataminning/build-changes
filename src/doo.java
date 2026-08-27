import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class doo implements dod {
   protected final ja f;

   protected static <P extends doo> P1<Mu<P>, ja> a(Instance<P> $$0) {
      return $$0.group(ja.v(16).optionalFieldOf("offset", ja.g).forGetter($$0x -> $$0x.f));
   }

   protected doo(ja $$0) {
      this.f = $$0;
   }

   public final boolean a(csz $$0, hx $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dhn var1);
}
