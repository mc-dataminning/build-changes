import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class eul extends eus {
   protected final List<eus> d;
   private final euk a;

   protected eul(List<eus> $$0, List<exn> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(eui $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract euk a(List<? extends euk> var1);

   @Override
   public final boolean expand(euc $$0, Consumer<eur> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends eul> MapCodec<T> a(eul.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(euq.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends eul> {
      T create(List<eus> var1, List<exn> var2);
   }
}
