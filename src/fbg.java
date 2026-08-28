import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fbg extends fbl {
   public static final MapCodec<fbg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dag.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fbg::new)
   );
   private final jg<dag> j;

   private fbg(jg<dag> $$0, int $$1, int $$2, List<fec> $$3, List<fch> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fbk a() {
      return fbh.c;
   }

   @Override
   public void a(Consumer<dak> $$0, fat $$1) {
      $$0.accept(new dak(this.j));
   }

   public static fbl.a<?> a(dki $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fbg($$0.h().e(), $$1, $$2, $$3, $$4));
   }
}
