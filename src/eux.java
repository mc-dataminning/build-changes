import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eux extends evf {
   public static final MapCodec<eux> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alj.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eux::new)
   );
   private final alj j;

   private eux(alj $$0, int $$1, int $$2, List<exy> $$3, List<ewb> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eve a() {
      return evb.e;
   }

   @Override
   public void a(Consumer<cwm> $$0, eun $$1) {
      $$1.a(this.j, $$0);
   }

   public static evf.a<?> a(alj $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eux($$0, $$1, $$2, $$3, $$4));
   }
}
