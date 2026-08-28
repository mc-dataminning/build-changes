import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class faw extends fbb {
   public static final MapCodec<faw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czw.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, faw::new)
   );
   private final jg<czw> j;

   private faw(jg<czw> $$0, int $$1, int $$2, List<fds> $$3, List<fbx> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fba a() {
      return fax.c;
   }

   @Override
   public void a(Consumer<daa> $$0, faj $$1) {
      $$0.accept(new daa(this.j));
   }

   public static fbb.a<?> a(djy $$0) {
      return a(($$1, $$2, $$3, $$4) -> new faw($$0.h().e(), $$1, $$2, $$3, $$4));
   }
}
