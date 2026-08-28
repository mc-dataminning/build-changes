import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eza extends ezf {
   public static final MapCodec<eza> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cyo.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eza::new)
   );
   private final je<cyo> j;

   private eza(je<cyo> $$0, int $$1, int $$2, List<fbw> $$3, List<fab> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eze a() {
      return ezb.c;
   }

   @Override
   public void a(Consumer<cys> $$0, eyn $$1) {
      $$0.accept(new cys(this.j));
   }

   public static ezf.a<?> a(dio $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eza($$0.h().e(), $$1, $$2, $$3, $$4));
   }
}
