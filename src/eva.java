import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eva extends evf {
   public static final MapCodec<eva> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lz.g.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eva::new)
   );
   private final jq<cwi> j;

   private eva(jq<cwi> $$0, int $$1, int $$2, List<exy> $$3, List<ewb> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eve a() {
      return evb.c;
   }

   @Override
   public void a(Consumer<cwm> $$0, eun $$1) {
      $$0.accept(new cwm(this.j));
   }

   public static evf.a<?> a(dfl $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eva($$0.j().f(), $$1, $$2, $$3, $$4));
   }
}
