import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ezy extends fag {
   public static final MapCodec<ezy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ezy::new)
   );
   private final alg j;

   private ezy(alg $$0, int $$1, int $$2, List<fcx> $$3, List<fbc> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public faf a() {
      return fac.e;
   }

   @Override
   public void a(Consumer<czk> $$0, ezo $$1) {
      $$1.a(this.j, $$0);
   }

   public static fag.a<?> a(alg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezy($$0, $$1, $$2, $$3, $$4));
   }
}
