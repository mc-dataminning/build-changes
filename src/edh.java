import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edh extends edg {
   public static final Codec<edh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aeu.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edh::new)
   );
   private final aeu j;

   private edh(aeu $$0, int $$1, int $$2, List<efk> $$3, List<edy> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public edf a() {
      return edc.d;
   }

   @Override
   public void a(Consumer<cja> $$0, ecl $$1) {
      ect $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(ecu $$0) {
      ecn<ect> $$1 = new ecn<>(ecq.c, this.j);
      if ($$0.a($$1)) {
         $$0.a("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.a("Unknown loot table called " + this.j));
      }
   }

   public static edg.a<?> a(aeu $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edh($$0, $$1, $$2, $$3, $$4));
   }
}
