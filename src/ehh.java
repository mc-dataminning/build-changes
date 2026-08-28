import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ehh extends ehi {
   public static final MapCodec<ehh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ehh::new));

   public ehh(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ehj<?> a() {
      return ehj.a;
   }

   @Override
   public List<efq.a> a(dda $$0, BiConsumer<jd, dta> $$1, ayv $$2, int $$3, jd $$4, efa $$5) {
      a($$0, $$1, $$2, $$4.d(), $$5);

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new efq.a($$4.b($$3), 0, false));
   }
}
