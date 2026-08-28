import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class exu extends eyb {
   protected final List<eyb> d;
   private final ext a;

   protected exu(List<eyb> $$0, List<fau> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(exr $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ext a(List<? extends ext> var1);

   @Override
   public final boolean expand(exl $$0, Consumer<eya> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends exu> MapCodec<T> a(exu.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(exz.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends exu> {
      T create(List<eyb> var1, List<fau> var2);
   }
}
