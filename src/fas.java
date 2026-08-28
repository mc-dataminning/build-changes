import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class fas extends faz {
   protected final List<faz> d;
   private final far a;

   protected fas(List<faz> $$0, List<fds> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(fap $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract far a(List<? extends far> var1);

   @Override
   public final boolean expand(faj $$0, Consumer<fay> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends fas> MapCodec<T> a(fas.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(fax.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends fas> {
      T create(List<faz> var1, List<fds> var2);
   }
}
