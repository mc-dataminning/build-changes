import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eup extends euu {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ly.g.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eup::new)
   );
   private final jq<cvx> j;

   private eup(jq<cvx> $$0, int $$1, int $$2, List<exn> $$3, List<evq> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eut a() {
      return euq.c;
   }

   @Override
   public void a(Consumer<cwb> $$0, euc $$1) {
      $$0.accept(new cwb(this.j));
   }

   public static euu.a<?> a(dfa $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eup($$0.j().f(), $$1, $$2, $$3, $$4));
   }
}
