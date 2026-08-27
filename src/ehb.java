import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ehb extends ehi {
   protected final List<ehi> d;
   private final eha a;

   protected ehb(List<ehi> $$0, List<ejo> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(egy $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract eha a(List<? extends eha> var1);

   @Override
   public final boolean expand(egp $$0, Consumer<ehh> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ehb> Codec<T> a(ehb.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(atq.a(ehg.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ehb> {
      T create(List<ehi> var1, List<ejo> var2);
   }
}
