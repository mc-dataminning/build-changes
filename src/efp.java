import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class efp extends efx {
   public static final Codec<efp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agm.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, efp::new)
   );
   private final agm j;

   private efp(agm $$0, int $$1, int $$2, List<eib> $$3, List<egp> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public efw a() {
      return eft.e;
   }

   @Override
   public void a(Consumer<clo> $$0, efc $$1) {
      $$1.a(this.j, $$0);
   }

   public static efx.a<?> a(agm $$0) {
      return a(($$1, $$2, $$3, $$4) -> new efp($$0, $$1, $$2, $$3, $$4));
   }
}
