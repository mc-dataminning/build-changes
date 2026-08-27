import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ekk extends ekr {
   protected final List<ekr> d;
   private final ekj a;

   protected ekk(List<ekr> $$0, List<emx> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(ekh $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ekj a(List<? extends ekj> var1);

   @Override
   public final boolean expand(ejy $$0, Consumer<ekq> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ekk> Codec<T> a(ekk.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(avu.a(ekp.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ekk> {
      T create(List<ekr> var1, List<emx> var2);
   }
}
