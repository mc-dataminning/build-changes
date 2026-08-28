import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class euf extends eum {
   protected final List<eum> d;
   private final eue a;

   protected euf(List<eum> $$0, List<exh> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(euc $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract eue a(List<? extends eue> var1);

   @Override
   public final boolean expand(etw $$0, Consumer<eul> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends euf> MapCodec<T> a(euf.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(euk.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends euf> {
      T create(List<eum> var1, List<exh> var2);
   }
}
