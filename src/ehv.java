import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehv extends eia {
   public static final Codec<ehv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ehv::new)
   );
   private final ih<cnb> j;

   private ehv(ih<cnb> $$0, int $$1, int $$2, List<eke> $$3, List<eis> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ehz a() {
      return ehw.c;
   }

   @Override
   public void a(Consumer<cng> $$0, ehf $$1) {
      $$0.accept(new cng(this.j));
   }

   public static eia.a<?> a(ctw $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehv($$0.j().i(), $$1, $$2, $$3, $$4));
   }
}
