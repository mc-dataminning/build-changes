import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edm extends edl {
   public static final Codec<edm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aex.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edm::new)
   );
   private final aex j;

   private edm(aex $$0, int $$1, int $$2, List<efp> $$3, List<eed> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public edk a() {
      return edh.d;
   }

   @Override
   public void a(Consumer<cjf> $$0, ecq $$1) {
      ecy $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(ecz $$0) {
      ecs<ecy> $$1 = new ecs<>(ecv.c, this.j);
      if ($$0.a($$1)) {
         $$0.a("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.a("Unknown loot table called " + this.j));
      }
   }

   public static edl.a<?> a(aex $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edm($$0, $$1, $$2, $$3, $$4));
   }
}
