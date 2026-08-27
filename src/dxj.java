import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dxj extends dxk {
   public static final Codec<dxj> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dxj::new));

   public dxj(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dxl<?> a() {
      return dxl.a;
   }

   @Override
   public List<dvs.a> a(cud $$0, BiConsumer<hx, djp> $$1, auw $$2, int $$3, hx $$4, dvc $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dvs.a($$4.b($$3), 0, false));
   }
}
