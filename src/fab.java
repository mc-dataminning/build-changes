import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fab extends fag {
   public static final MapCodec<fab> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czg.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fab::new)
   );
   private final jf<czg> j;

   private fab(jf<czg> $$0, int $$1, int $$2, List<fcx> $$3, List<fbc> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public faf a() {
      return fac.c;
   }

   @Override
   public void a(Consumer<czk> $$0, ezo $$1) {
      $$0.accept(new czk(this.j));
   }

   public static fag.a<?> a(djg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fab($$0.h().e(), $$1, $$2, $$3, $$4));
   }
}
