import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class epr extends epz {
   public static final MapCodec<epr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akn.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, epr::new)
   );
   private final akn j;

   private epr(akn $$0, int $$1, int $$2, List<esn> $$3, List<eqt> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public epy a() {
      return epv.e;
   }

   @Override
   public void a(Consumer<ctq> $$0, eph $$1) {
      $$1.a(this.j, $$0);
   }

   public static epz.a<?> a(akn $$0) {
      return a(($$1, $$2, $$3, $$4) -> new epr($$0, $$1, $$2, $$3, $$4));
   }
}
