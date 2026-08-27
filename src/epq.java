import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class epq extends epx {
   protected final List<epx> d;
   private final epp a;

   protected epq(List<epx> $$0, List<esn> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(epn $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract epp a(List<? extends epp> var1);

   @Override
   public final boolean expand(eph $$0, Consumer<epw> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends epq> MapCodec<T> a(epq.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(epv.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends epq> {
      T create(List<epx> var1, List<esn> var2);
   }
}
