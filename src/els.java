import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class els extends elr {
   public static final Codec<els> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajh.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, els::new)
   );
   private final ajh j;

   private els(ajh $$0, int $$1, int $$2, List<env> $$3, List<emj> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public elq a() {
      return eln.d;
   }

   @Override
   public void a(Consumer<cqm> $$0, ekw $$1) {
      ele $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(elf $$0) {
      eky<ele> $$1 = new eky<>(elb.c, this.j);
      if ($$0.a($$1)) {
         $$0.b("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.b("Unknown loot table called " + this.j));
      }
   }

   public static elr.a<?> a(ajh $$0) {
      return a(($$1, $$2, $$3, $$4) -> new els($$0, $$1, $$2, $$3, $$4));
   }
}
