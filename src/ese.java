import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ese extends esj {
   public static final MapCodec<ese> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lt.g.s().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ese::new)
   );
   private final jm<cul> j;

   private ese(jm<cul> $$0, int $$1, int $$2, List<evc> $$3, List<etf> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public esi a() {
      return esf.c;
   }

   @Override
   public void a(Consumer<cuq> $$0, err $$1) {
      $$0.accept(new cuq(this.j));
   }

   public static esj.a<?> a(dcv $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ese($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
