import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esq extends ers {
   static final MapCodec<esq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eum.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, esq::new));
   private final eul b;

   private esq(List<etq> $$0, eul $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<esz<?>> a() {
      return this.b.a();
   }

   @Override
   public eru<esq> b() {
      return erv.Q;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      $$0.b(km.P, Integer.valueOf(this.b.a($$1)));
      return $$0;
   }

   public eul c() {
      return this.b;
   }

   public static ers.a<?> a(eul $$0) {
      return a($$1 -> new esq($$1, $$0));
   }
}
