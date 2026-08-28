import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class epw extends epx {
   public static final MapCodec<epw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, epw::new));

   public epw(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected epy<?> a() {
      return epy.a;
   }

   @Override
   public List<eob.a> a(dkd $$0, BiConsumer<iv, ebe> $$1, azx $$2, int $$3, iv $$4, enl $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new eob.a($$4.b($$3), 0, false));
   }
}
