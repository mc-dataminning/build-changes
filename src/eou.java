import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class eou extends epb {
   protected final List<epb> d;
   private final eot a;

   protected eou(List<epb> $$0, List<erq> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(eor $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract eot a(List<? extends eot> var1);

   @Override
   public final boolean expand(eol $$0, Consumer<epa> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends eou> Codec<T> a(eou.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(axh.a(eoz.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends eou> {
      T create(List<epb> var1, List<erq> var2);
   }
}
