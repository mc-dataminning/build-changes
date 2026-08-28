import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eut extends euy {
   public static final MapCodec<eut> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lz.g.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eut::new)
   );
   private final jq<cwb> j;

   private eut(jq<cwb> $$0, int $$1, int $$2, List<exr> $$3, List<evu> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eux a() {
      return euu.c;
   }

   @Override
   public void a(Consumer<cwf> $$0, eug $$1) {
      $$0.accept(new cwf(this.j));
   }

   public static euy.a<?> a(dfe $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eut($$0.j().f(), $$1, $$2, $$3, $$4));
   }
}
