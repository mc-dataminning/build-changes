import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etq extends ete {
   public static final MapCodec<etq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uz.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, etq::new));
   private final ub b;

   private etq(List<evc> $$0, ub $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etg<etq> b() {
      return eth.j;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      cxh.a(kq.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static ete.a<?> a(ub $$0) {
      return a($$1 -> new etq($$1, $$0));
   }
}
