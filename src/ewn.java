import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewn extends ewa {
   static final MapCodec<ewn> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eyv.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, ewn::new));
   private final eyu b;

   private ewn(List<exy> $$0, eyu $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<exg<?>> a() {
      return this.b.a();
   }

   @Override
   public ewc<ewn> b() {
      return ewd.R;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      $$0.b(ku.p, new cyw(this.b.a($$1)));
      return $$0;
   }
}
