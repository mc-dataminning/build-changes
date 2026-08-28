import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class eyw extends ezd {
   protected final List<ezd> d;
   private final eyv a;

   protected eyw(List<ezd> $$0, List<fbw> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(eyt $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract eyv a(List<? extends eyv> var1);

   @Override
   public final boolean expand(eyn $$0, Consumer<ezc> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends eyw> MapCodec<T> a(eyw.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(ezb.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends eyw> {
      T create(List<ezd> var1, List<fbw> var2);
   }
}
