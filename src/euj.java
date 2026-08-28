import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class euj extends euo {
   public static final MapCodec<euj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lx.g.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, euj::new)
   );
   private final jp<cvt> j;

   private euj(jp<cvt> $$0, int $$1, int $$2, List<exh> $$3, List<evk> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eun a() {
      return euk.c;
   }

   @Override
   public void a(Consumer<cvx> $$0, etw $$1) {
      $$0.accept(new cvx(this.j));
   }

   public static euo.a<?> a(deu $$0) {
      return a(($$1, $$2, $$3, $$4) -> new euj($$0.j().f(), $$1, $$2, $$3, $$4));
   }
}
