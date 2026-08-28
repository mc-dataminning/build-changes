import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erq extends ers {
   public static final MapCodec<erq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eqf.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, erq::new));
   private final eqf b;

   private erq(List<etq> $$0, eqf $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eru<erq> b() {
      return erv.w;
   }

   @Override
   public Set<esz<?>> a() {
      return this.b.a();
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      int $$2 = this.b.a($$1, $$0.I());
      $$0.e($$2);
      return $$0;
   }

   public static ers.a<?> a(eqf $$0) {
      return a($$1 -> new erq($$1, $$0));
   }
}
