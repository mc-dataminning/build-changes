import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class edl extends edm {
   public static final Codec<edl> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, edl::new));

   public edl(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected edn<?> a() {
      return edn.a;
   }

   @Override
   public List<ebu.a> a(czm $$0, BiConsumer<id, dpi> $$1, axt $$2, int $$3, id $$4, ebe $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new ebu.a($$4.b($$3), 0, false));
   }
}
