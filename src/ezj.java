import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ezj extends ezr {
   public static final MapCodec<ezj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ezj::new)
   );
   private final alg j;

   private ezj(alg $$0, int $$1, int $$2, List<fci> $$3, List<fan> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ezq a() {
      return ezn.e;
   }

   @Override
   public void a(Consumer<cyy> $$0, eyz $$1) {
      $$1.a(this.j, $$0);
   }

   public static ezr.a<?> a(alg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezj($$0, $$1, $$2, $$3, $$4));
   }
}
