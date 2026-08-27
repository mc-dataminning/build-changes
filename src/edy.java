import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edy extends eed {
   public static final Codec<edy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.i.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edy::new)
   );
   private final ib<cke> j;

   private edy(ib<cke> $$0, int $$1, int $$2, List<egh> $$3, List<eev> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eec a() {
      return edz.c;
   }

   @Override
   public void a(Consumer<ckj> $$0, edi $$1) {
      $$0.accept(new ckj(this.j));
   }

   public static eed.a<?> a(cqy $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edy($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
