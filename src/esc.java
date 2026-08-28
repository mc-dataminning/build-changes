import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class esc extends esh {
   public static final MapCodec<esc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lt.g.s().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, esc::new)
   );
   private final jm<cul> j;

   private esc(jm<cul> $$0, int $$1, int $$2, List<eva> $$3, List<etd> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public esg a() {
      return esd.c;
   }

   @Override
   public void a(Consumer<cuq> $$0, erp $$1) {
      $$0.accept(new cuq(this.j));
   }

   public static esh.a<?> a(dcv $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esc($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
