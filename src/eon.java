import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eon extends eoo {
   public static final Codec<eon> a = RecordCodecBuilder.create($$0 -> a($$0).and(ena.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eon::new));
   private final ena b;

   private eon(List<eqc> $$0, ena $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoq b() {
      return eor.r;
   }

   @Override
   public Set<epl<?>> a() {
      return this.b.a();
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      int $$2 = this.b.a($$1, $$0.G());
      $$0.e($$2);
      return $$0;
   }

   public static eoo.a<?> a(ena $$0) {
      return a($$1 -> new eon($$1, $$0));
   }
}
