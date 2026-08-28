import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fad extends fal {
   public static final MapCodec<fad> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fad::new)
   );
   private final alg j;

   private fad(alg $$0, int $$1, int $$2, List<fdc> $$3, List<fbh> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fak a() {
      return fah.e;
   }

   @Override
   public void a(Consumer<czn> $$0, ezt $$1) {
      $$1.a(this.j, $$0);
   }

   public static fal.a<?> a(alg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fad($$0, $$1, $$2, $$3, $$4));
   }
}
