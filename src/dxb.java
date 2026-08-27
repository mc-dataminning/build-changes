import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dxb extends dxc {
   public static final Codec<dxb> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dxb::new));

   public dxb(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dxd<?> a() {
      return dxd.a;
   }

   @Override
   public List<dvk.a> a(ctv $$0, BiConsumer<hx, djh> $$1, auv $$2, int $$3, hx $$4, duu $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dvk.a($$4.b($$3), 0, false));
   }
}
