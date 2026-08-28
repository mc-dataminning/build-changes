import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ezm extends ezr {
   public static final MapCodec<ezm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cyu.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ezm::new)
   );
   private final je<cyu> j;

   private ezm(je<cyu> $$0, int $$1, int $$2, List<fci> $$3, List<fan> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ezq a() {
      return ezn.c;
   }

   @Override
   public void a(Consumer<cyy> $$0, eyz $$1) {
      $$0.accept(new cyy(this.j));
   }

   public static ezr.a<?> a(diu $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezm($$0.h().e(), $$1, $$2, $$3, $$4));
   }
}
