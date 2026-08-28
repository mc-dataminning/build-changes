import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etp extends etc {
   static final MapCodec<etp> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(evx.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, etp::new));
   private final evw b;

   private etp(List<eva> $$0, evw $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<eui<?>> a() {
      return this.b.a();
   }

   @Override
   public ete<etp> b() {
      return etf.R;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      $$0.b(kq.o, new cxi(this.b.a($$1)));
      return $$0;
   }
}
