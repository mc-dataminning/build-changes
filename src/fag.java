import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fag extends fal {
   public static final MapCodec<fag> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czj.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fag::new)
   );
   private final jf<czj> j;

   private fag(jf<czj> $$0, int $$1, int $$2, List<fdc> $$3, List<fbh> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fak a() {
      return fah.c;
   }

   @Override
   public void a(Consumer<czn> $$0, ezt $$1) {
      $$0.accept(new czn(this.j));
   }

   public static fal.a<?> a(djl $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fag($$0.h().e(), $$1, $$2, $$3, $$4));
   }
}
