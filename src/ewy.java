import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ewy extends exf {
   protected final List<exf> d;
   private final ewx a;

   protected ewy(List<exf> $$0, List<ezy> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(ewv $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ewx a(List<? extends ewx> var1);

   @Override
   public final boolean expand(ewp $$0, Consumer<exe> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ewy> MapCodec<T> a(ewy.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(exd.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ewy> {
      T create(List<exf> var1, List<ezy> var2);
   }
}
