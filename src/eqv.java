import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqv extends era {
   public static final MapCodec<eqv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqv::new)
   );
   private final ji<cuk> j;

   private eqv(ji<cuk> $$0, int $$1, int $$2, List<ets> $$3, List<erv> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eqz a() {
      return eqw.c;
   }

   @Override
   public void a(Consumer<cup> $$0, eqi $$1) {
      $$0.accept(new cup(this.j));
   }

   public static era.a<?> a(dbx $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqv($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
