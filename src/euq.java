import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class euq extends euy {
   public static final MapCodec<euq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(all.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, euq::new)
   );
   private final all j;

   private euq(all $$0, int $$1, int $$2, List<exr> $$3, List<evu> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eux a() {
      return euu.e;
   }

   @Override
   public void a(Consumer<cwf> $$0, eug $$1) {
      $$1.a(this.j, $$0);
   }

   public static euy.a<?> a(all $$0) {
      return a(($$1, $$2, $$3, $$4) -> new euq($$0, $$1, $$2, $$3, $$4));
   }
}
