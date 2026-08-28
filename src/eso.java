import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eso extends esb {
   static final MapCodec<eso> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(euw.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, eso::new));
   private final euv b;

   private eso(List<etz> $$0, euv $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<eth<?>> a() {
      return this.b.a();
   }

   @Override
   public esd<eso> b() {
      return ese.R;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      $$0.b(kn.o, new cwp(this.b.a($$1)));
      return $$0;
   }
}
