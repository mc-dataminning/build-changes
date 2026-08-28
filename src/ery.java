import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ery extends esd {
   public static final MapCodec<ery> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lt.g.s().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ery::new)
   );
   private final jm<cuj> j;

   private ery(jm<cuj> $$0, int $$1, int $$2, List<euw> $$3, List<esz> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public esc a() {
      return erz.c;
   }

   @Override
   public void a(Consumer<cuo> $$0, erl $$1) {
      $$0.accept(new cuo(this.j));
   }

   public static esd.a<?> a(dct $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ery($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
