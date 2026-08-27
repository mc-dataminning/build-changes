import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eih extends eii {
   public static final Codec<eih> a = RecordCodecBuilder.create($$0 -> a($$0).and(egv.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eih::new));
   private final egv b;

   private eih(List<ejv> $$0, egv $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eik b() {
      return eil.q;
   }

   @Override
   public Set<eje<?>> a() {
      return this.b.a();
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static eii.a<?> a(egv $$0) {
      return a($$1 -> new eih($$1, $$0));
   }
}
