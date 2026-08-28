import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fau extends faz {
   public static final MapCodec<fau> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czu.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fau::new)
   );
   private final jf<czu> j;

   private fau(jf<czu> $$0, int $$1, int $$2, List<fdq> $$3, List<fbv> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fay a() {
      return fav.c;
   }

   @Override
   public void a(Consumer<czy> $$0, fah $$1) {
      $$0.accept(new czy(this.j));
   }

   public static faz.a<?> a(djw $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fau($$0.h().e(), $$1, $$2, $$3, $$4));
   }
}
