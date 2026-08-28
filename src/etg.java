import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class etg extends etl {
   public static final MapCodec<etg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.g.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, etg::new)
   );
   private final jn<cvg> j;

   private etg(jn<cvg> $$0, int $$1, int $$2, List<ewe> $$3, List<euh> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public etk a() {
      return eth.c;
   }

   @Override
   public void a(Consumer<cvl> $$0, est $$1) {
      $$0.accept(new cvl(this.j));
   }

   public static etl.a<?> a(ddr $$0) {
      return a(($$1, $$2, $$3, $$4) -> new etg($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
