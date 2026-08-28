import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqx extends erc {
   public static final MapCodec<eqx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqx::new)
   );
   private final ji<cum> j;

   private eqx(ji<cum> $$0, int $$1, int $$2, List<etu> $$3, List<erx> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public erb a() {
      return eqy.c;
   }

   @Override
   public void a(Consumer<cur> $$0, eqk $$1) {
      $$0.accept(new cur(this.j));
   }

   public static erc.a<?> a(dbz $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqx($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
