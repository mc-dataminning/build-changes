import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehs extends eia {
   public static final Codec<ehs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahh.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ehs::new)
   );
   private final ahh j;

   private ehs(ahh $$0, int $$1, int $$2, List<eke> $$3, List<eis> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ehz a() {
      return ehw.e;
   }

   @Override
   public void a(Consumer<cng> $$0, ehf $$1) {
      $$1.a(this.j, $$0);
   }

   public static eia.a<?> a(ahh $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehs($$0, $$1, $$2, $$3, $$4));
   }
}
