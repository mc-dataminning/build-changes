import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dxa extends dxb {
   public static final Codec<dxa> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dxa::new));

   public dxa(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dxc<?> a() {
      return dxc.a;
   }

   @Override
   public List<dvj.a> a(ctu $$0, BiConsumer<hx, djg> $$1, auu $$2, int $$3, hx $$4, dut $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dvj.a($$4.b($$3), 0, false));
   }
}
