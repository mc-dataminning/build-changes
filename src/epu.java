import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epu extends epw {
   public static final Codec<epu> a = RecordCodecBuilder.create($$0 -> a($$0).and(eok.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, epu::new));
   private final eok b;

   private epu(List<erq> $$0, eok $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epy b() {
      return epz.t;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.b.a();
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      int $$2 = this.b.a($$1, $$0.G());
      $$0.e($$2);
      return $$0;
   }

   public static epw.a<?> a(eok $$0) {
      return a($$1 -> new epu($$1, $$0));
   }
}
