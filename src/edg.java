import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edg extends edl {
   public static final Codec<edg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.i.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edg::new)
   );
   private final hg<cja> j;

   private edg(hg<cja> $$0, int $$1, int $$2, List<efp> $$3, List<eed> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public edk a() {
      return edh.c;
   }

   @Override
   public void a(Consumer<cjf> $$0, ecq $$1) {
      $$0.accept(new cjf(this.j));
   }

   public static edl.a<?> a(cpu $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edg($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
