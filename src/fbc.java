import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class fbc extends fbj {
   protected final List<fbj> d;
   private final fbb a;

   protected fbc(List<fbj> $$0, List<fec> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(faz $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract fbb a(List<? extends fbb> var1);

   @Override
   public final boolean expand(fat $$0, Consumer<fbi> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends fbc> MapCodec<T> a(fbc.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(fbh.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends fbc> {
      T create(List<fbj> var1, List<fec> var2);
   }
}
