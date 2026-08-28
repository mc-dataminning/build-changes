import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esh extends ert {
   static final MapCodec<esh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eun.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, esh::new));
   private final eum b;

   private esh(List<etr> $$0, eum $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<eta<?>> a() {
      return this.b.a();
   }

   @Override
   public erv<esh> b() {
      return erw.R;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      $$0.b(km.o, new cxe(this.b.a($$1)));
      return $$0;
   }
}
