import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edo extends edn {
   public static final Codec<edo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aey.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edo::new)
   );
   private final aey j;

   private edo(aey $$0, int $$1, int $$2, List<efr> $$3, List<eef> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public edm a() {
      return edj.d;
   }

   @Override
   public void a(Consumer<cjh> $$0, ecs $$1) {
      eda $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(edb $$0) {
      ecu<eda> $$1 = new ecu<>(ecx.c, this.j);
      if ($$0.a($$1)) {
         $$0.a("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.a("Unknown loot table called " + this.j));
      }
   }

   public static edn.a<?> a(aey $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edo($$0, $$1, $$2, $$3, $$4));
   }
}
