import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etr extends ete {
   static final MapCodec<etr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(evz.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, etr::new));
   private final evy b;

   private etr(List<evc> $$0, evy $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<euk<?>> a() {
      return this.b.a();
   }

   @Override
   public etg<etr> b() {
      return eth.R;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      $$0.b(kq.o, new cxi(this.b.a($$1)));
      return $$0;
   }
}
