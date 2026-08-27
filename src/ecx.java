import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ecx extends edc {
   public static final Codec<ecx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.i.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ecx::new)
   );
   private final he<cit> j;

   private ecx(he<cit> $$0, int $$1, int $$2, List<efg> $$3, List<edu> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public edb a() {
      return ecy.c;
   }

   @Override
   public void a(Consumer<ciy> $$0, ech $$1) {
      $$0.accept(new ciy(this.j));
   }

   public static edc.a<?> a(cpl $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ecx($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
