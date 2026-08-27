import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class efk extends efs {
   public static final Codec<efk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agi.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, efk::new)
   );
   private final agi j;

   private efk(agi $$0, int $$1, int $$2, List<ehw> $$3, List<egk> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public efr a() {
      return efo.e;
   }

   @Override
   public void a(Consumer<clj> $$0, eex $$1) {
      $$1.a(this.j, $$0);
   }

   public static efs.a<?> a(agi $$0) {
      return a(($$1, $$2, $$3, $$4) -> new efk($$0, $$1, $$2, $$3, $$4));
   }
}
