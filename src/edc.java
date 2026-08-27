import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edc extends edb {
   public static final Codec<edc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aer.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edc::new)
   );
   private final aer j;

   private edc(aer $$0, int $$1, int $$2, List<eff> $$3, List<edt> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eda a() {
      return ecx.d;
   }

   @Override
   public void a(Consumer<cix> $$0, ecg $$1) {
      eco $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(ecp $$0) {
      eci<eco> $$1 = new eci<>(ecl.c, this.j);
      if ($$0.a($$1)) {
         $$0.a("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.a("Unknown loot table called " + this.j));
      }
   }

   public static edb.a<?> a(aer $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edc($$0, $$1, $$2, $$3, $$4));
   }
}
