import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eow extends eox {
   public static final Codec<eow> a = RecordCodecBuilder.create($$0 -> a($$0).and(enj.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eow::new));
   private final enj b;

   private eow(List<eql> $$0, enj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoz b() {
      return epa.r;
   }

   @Override
   public Set<epu<?>> a() {
      return this.b.a();
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      int $$2 = this.b.a($$1, $$0.G());
      $$0.e($$2);
      return $$0;
   }

   public static eox.a<?> a(enj $$0) {
      return a($$1 -> new eow($$1, $$0));
   }
}
