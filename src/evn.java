import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evn extends evp {
   public static final MapCodec<evn> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eub.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, evn::new));
   private final eub b;

   private evn(List<exn> $$0, eub $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evr<evn> b() {
      return evs.w;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.b.a();
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.e($$2);
      return $$0;
   }

   public static evp.a<?> a(eub $$0) {
      return a($$1 -> new evn($$1, $$0));
   }
}
