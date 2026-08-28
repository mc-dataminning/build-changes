import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqs extends era {
   public static final MapCodec<eqs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqs::new)
   );
   private final alf j;

   private eqs(alf $$0, int $$1, int $$2, List<ets> $$3, List<erv> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eqz a() {
      return eqw.e;
   }

   @Override
   public void a(Consumer<cup> $$0, eqi $$1) {
      $$1.a(this.j, $$0);
   }

   public static era.a<?> a(alf $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqs($$0, $$1, $$2, $$3, $$4));
   }
}
