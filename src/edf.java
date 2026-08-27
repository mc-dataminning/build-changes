import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edf extends edn {
   public static final Codec<edf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aey.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edf::new)
   );
   private final aey j;

   private edf(aey $$0, int $$1, int $$2, List<efr> $$3, List<eef> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public edm a() {
      return edj.e;
   }

   @Override
   public void a(Consumer<cjh> $$0, ecs $$1) {
      $$1.a(this.j, $$0);
   }

   public static edn.a<?> a(aey $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edf($$0, $$1, $$2, $$3, $$4));
   }
}
