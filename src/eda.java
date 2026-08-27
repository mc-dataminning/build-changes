import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eda extends edf {
   public static final Codec<eda> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.i.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eda::new)
   );
   private final he<cjg> j;

   private eda(he<cjg> $$0, int $$1, int $$2, List<efj> $$3, List<edx> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ede a() {
      return edb.c;
   }

   @Override
   public void a(Consumer<cjl> $$0, eck $$1) {
      $$0.accept(new cjl(this.j));
   }

   public static edf.a<?> a(cqa $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eda($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
