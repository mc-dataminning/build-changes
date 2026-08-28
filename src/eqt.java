import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqt extends erb {
   public static final MapCodec<eqt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqt::new)
   );
   private final alf j;

   private eqt(alf $$0, int $$1, int $$2, List<ett> $$3, List<erw> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public era a() {
      return eqx.e;
   }

   @Override
   public void a(Consumer<cuq> $$0, eqj $$1) {
      $$1.a(this.j, $$0);
   }

   public static erb.a<?> a(alf $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqt($$0, $$1, $$2, $$3, $$4));
   }
}
