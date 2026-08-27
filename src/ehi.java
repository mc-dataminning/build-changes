import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehi extends ehq {
   public static final Codec<ehi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahg.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ehi::new)
   );
   private final ahg j;

   private ehi(ahg $$0, int $$1, int $$2, List<eju> $$3, List<eii> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ehp a() {
      return ehm.e;
   }

   @Override
   public void a(Consumer<cmx> $$0, egv $$1) {
      $$1.a(this.j, $$0);
   }

   public static ehq.a<?> a(ahg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehi($$0, $$1, $$2, $$3, $$4));
   }
}
