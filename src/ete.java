import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ete extends etl {
   public static final MapCodec<ete> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ete::new));

   private ete(int $$0, int $$1, List<ewe> $$2, List<euh> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public etk a() {
      return eth.b;
   }

   @Override
   public void a(Consumer<cvl> $$0, est $$1) {
   }

   public static etl.a<?> b() {
      return a(ete::new);
   }
}
