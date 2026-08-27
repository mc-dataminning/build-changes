import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eey extends efg {
   public static final Codec<eey> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agg.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eey::new)
   );
   private final agg j;

   private eey(agg $$0, int $$1, int $$2, List<ehk> $$3, List<efy> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eff a() {
      return efc.e;
   }

   @Override
   public void a(Consumer<clb> $$0, eel $$1) {
      $$1.a(this.j, $$0);
   }

   public static efg.a<?> a(agg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eey($$0, $$1, $$2, $$3, $$4));
   }
}
