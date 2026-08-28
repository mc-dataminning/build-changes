import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fbd extends fbl {
   public static final MapCodec<fbd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alr.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fbd::new)
   );
   private final alr j;

   private fbd(alr $$0, int $$1, int $$2, List<fec> $$3, List<fch> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fbk a() {
      return fbh.e;
   }

   @Override
   public void a(Consumer<dak> $$0, fat $$1) {
      $$1.a(this.j, $$0);
   }

   public static fbl.a<?> a(alr $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fbd($$0, $$1, $$2, $$3, $$4));
   }
}
