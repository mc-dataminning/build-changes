import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqw extends erb {
   public static final MapCodec<eqw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqw::new)
   );
   private final ji<cul> j;

   private eqw(ji<cul> $$0, int $$1, int $$2, List<ett> $$3, List<erw> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public era a() {
      return eqx.c;
   }

   @Override
   public void a(Consumer<cuq> $$0, eqj $$1) {
      $$0.accept(new cuq(this.j));
   }

   public static erb.a<?> a(dby $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqw($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
