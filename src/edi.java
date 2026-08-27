import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edi extends edn {
   public static final Codec<edi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.i.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edi::new)
   );
   private final hg<cjc> j;

   private edi(hg<cjc> $$0, int $$1, int $$2, List<efr> $$3, List<eef> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public edm a() {
      return edj.c;
   }

   @Override
   public void a(Consumer<cjh> $$0, ecs $$1) {
      $$0.accept(new cjh(this.j));
   }

   public static edn.a<?> a(cpw $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edi($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
