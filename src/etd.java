import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class etd extends etl {
   public static final MapCodec<etd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, etd::new)
   );
   private final alb j;

   private etd(alb $$0, int $$1, int $$2, List<ewe> $$3, List<euh> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public etk a() {
      return eth.e;
   }

   @Override
   public void a(Consumer<cvl> $$0, est $$1) {
      $$1.a(this.j, $$0);
   }

   public static etl.a<?> a(alb $$0) {
      return a(($$1, $$2, $$3, $$4) -> new etd($$0, $$1, $$2, $$3, $$4));
   }
}
