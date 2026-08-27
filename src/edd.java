import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edd extends edl {
   public static final Codec<edd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aew.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edd::new)
   );
   private final aew j;

   private edd(aew $$0, int $$1, int $$2, List<efp> $$3, List<eed> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public edk a() {
      return edh.e;
   }

   @Override
   public void a(Consumer<cjf> $$0, ecq $$1) {
      $$1.a(this.j, $$0);
   }

   public static edl.a<?> a(aew $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edd($$0, $$1, $$2, $$3, $$4));
   }
}
