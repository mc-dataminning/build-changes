import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewl extends evt {
   public static final MapCodec<ewl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyo.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ewl::new)
   );
   private final eyn b;
   private final boolean c;

   private ewl(List<exr> $$0, eyn $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public evv<ewl> b() {
      return evw.e;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.b.a();
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static evt.a<?> a(eyn $$0) {
      return a($$1 -> new ewl($$1, $$0, false));
   }

   public static evt.a<?> a(eyn $$0, boolean $$1) {
      return a($$2 -> new ewl($$2, $$0, $$1));
   }
}
