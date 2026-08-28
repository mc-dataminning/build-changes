import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eto extends etc {
   public static final MapCodec<eto> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uz.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eto::new));
   private final ub b;

   private eto(List<eva> $$0, ub $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ete<eto> b() {
      return etf.j;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      cxh.a(kq.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static etc.a<?> a(ub $$0) {
      return a($$1 -> new eto($$1, $$0));
   }
}
