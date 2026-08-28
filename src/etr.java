import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class etr extends etz {
   public static final MapCodec<etr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, etr::new)
   );
   private final alc j;

   private etr(alc $$0, int $$1, int $$2, List<ews> $$3, List<euv> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ety a() {
      return etv.e;
   }

   @Override
   public void a(Consumer<cvp> $$0, eth $$1) {
      $$1.a(this.j, $$0);
   }

   public static etz.a<?> a(alc $$0) {
      return a(($$1, $$2, $$3, $$4) -> new etr($$0, $$1, $$2, $$3, $$4));
   }
}
