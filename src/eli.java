import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class eli extends elp {
   protected final List<elp> d;
   private final elh a;

   protected eli(List<elp> $$0, List<env> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(elf $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract elh a(List<? extends elh> var1);

   @Override
   public final boolean expand(ekw $$0, Consumer<elo> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends eli> Codec<T> a(eli.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(awe.a(eln.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends eli> {
      T create(List<elp> var1, List<env> var2);
   }
}
