import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dsy extends dsz {
   public static final Codec<dsy> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dsy::new));

   public dsy(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dta<?> a() {
      return dta.a;
   }

   @Override
   public List<drh.a> a(cpw $$0, BiConsumer<gw, dfe> $$1, arx $$2, int $$3, gw $$4, dqr $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new drh.a($$4.b($$3), 0, false));
   }
}
