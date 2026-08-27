import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class elj extends elr {
   public static final Codec<elj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajh.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, elj::new)
   );
   private final ajh j;

   private elj(ajh $$0, int $$1, int $$2, List<env> $$3, List<emj> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public elq a() {
      return eln.e;
   }

   @Override
   public void a(Consumer<cqm> $$0, ekw $$1) {
      $$1.a(this.j, $$0);
   }

   public static elr.a<?> a(ajh $$0) {
      return a(($$1, $$2, $$3, $$4) -> new elj($$0, $$1, $$2, $$3, $$4));
   }
}
