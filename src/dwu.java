import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dwu extends dwv {
   public static final Codec<dwu> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dwu::new));

   public dwu(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dww<?> a() {
      return dww.a;
   }

   @Override
   public List<dvd.a> a(cto $$0, BiConsumer<hx, dja> $$1, aup $$2, int $$3, hx $$4, dun $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dvd.a($$4.b($$3), 0, false));
   }
}
