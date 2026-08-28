import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class etu extends etz {
   public static final MapCodec<etu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.g.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, etu::new)
   );
   private final jn<cvk> j;

   private etu(jn<cvk> $$0, int $$1, int $$2, List<ews> $$3, List<euv> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ety a() {
      return etv.c;
   }

   @Override
   public void a(Consumer<cvp> $$0, eth $$1) {
      $$0.accept(new cvp(this.j));
   }

   public static etz.a<?> a(def $$0) {
      return a(($$1, $$2, $$3, $$4) -> new etu($$0.q().n(), $$1, $$2, $$3, $$4));
   }
}
