import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ecy extends edg {
   public static final Codec<ecy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aeu.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ecy::new)
   );
   private final aeu j;

   private ecy(aeu $$0, int $$1, int $$2, List<efk> $$3, List<edy> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public edf a() {
      return edc.e;
   }

   @Override
   public void a(Consumer<cja> $$0, ecl $$1) {
      $$1.a(this.j, $$0);
   }

   public static edg.a<?> a(aeu $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ecy($$0, $$1, $$2, $$3, $$4));
   }
}
