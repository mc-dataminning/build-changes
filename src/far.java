import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class far extends faz {
   public static final MapCodec<far> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, far::new)
   );
   private final ali j;

   private far(ali $$0, int $$1, int $$2, List<fdq> $$3, List<fbv> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fay a() {
      return fav.e;
   }

   @Override
   public void a(Consumer<czy> $$0, fah $$1) {
      $$1.a(this.j, $$0);
   }

   public static faz.a<?> a(ali $$0) {
      return a(($$1, $$2, $$3, $$4) -> new far($$0, $$1, $$2, $$3, $$4));
   }
}
