import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eum extends euu {
   public static final MapCodec<eum> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eum::new)
   );
   private final ali j;

   private eum(ali $$0, int $$1, int $$2, List<exn> $$3, List<evq> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eut a() {
      return euq.e;
   }

   @Override
   public void a(Consumer<cwb> $$0, euc $$1) {
      $$1.a(this.j, $$0);
   }

   public static euu.a<?> a(ali $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eum($$0, $$1, $$2, $$3, $$4));
   }
}
