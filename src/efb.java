import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class efb extends efg {
   public static final Codec<efb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.i.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, efb::new)
   );
   private final ib<ckw> j;

   private efb(ib<ckw> $$0, int $$1, int $$2, List<ehk> $$3, List<efy> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eff a() {
      return efc.c;
   }

   @Override
   public void a(Consumer<clb> $$0, eel $$1) {
      $$0.accept(new clb(this.j));
   }

   public static efg.a<?> a(crr $$0) {
      return a(($$1, $$2, $$3, $$4) -> new efb($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
