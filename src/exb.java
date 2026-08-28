import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class exb extends exg {
   public static final MapCodec<exb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.g.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, exb::new)
   );
   private final jq<cxk> j;

   private exb(jq<cxk> $$0, int $$1, int $$2, List<ezx> $$3, List<eyc> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public exf a() {
      return exc.c;
   }

   @Override
   public void a(Consumer<cxo> $$0, ewo $$1) {
      $$0.accept(new cxo(this.j));
   }

   public static exg.a<?> a(dhg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exb($$0.j().f(), $$1, $$2, $$3, $$4));
   }
}
