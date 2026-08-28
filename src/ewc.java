import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewc extends evp {
   static final MapCodec<ewc> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eyk.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, ewc::new));
   private final eyj b;

   private ewc(List<exn> $$0, eyj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.b.a();
   }

   @Override
   public evr<ewc> b() {
      return evs.R;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      $$0.b(ku.p, new cyl(this.b.a($$1)));
      return $$0;
   }
}
