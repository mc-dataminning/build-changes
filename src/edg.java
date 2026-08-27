import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edg extends edf {
   public static final Codec<edg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aez.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edg::new)
   );
   private final aez j;

   private edg(aez $$0, int $$1, int $$2, List<efj> $$3, List<edx> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ede a() {
      return edb.d;
   }

   @Override
   public void a(Consumer<cjl> $$0, eck $$1) {
      ecs $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(ect $$0) {
      ecm<ecs> $$1 = new ecm<>(ecp.c, this.j);
      if ($$0.a($$1)) {
         $$0.a("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.a("Unknown loot table called " + this.j));
      }
   }

   public static edf.a<?> a(aez $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edg($$0, $$1, $$2, $$3, $$4));
   }
}
