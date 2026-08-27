import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class elh extends elp {
   public static final Codec<elh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajh.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, elh::new)
   );
   private final ajh j;

   private elh(ajh $$0, int $$1, int $$2, List<ent> $$3, List<emh> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public elo a() {
      return ell.e;
   }

   @Override
   public void a(Consumer<cqk> $$0, eku $$1) {
      $$1.a(this.j, $$0);
   }

   public static elp.a<?> a(ajh $$0) {
      return a(($$1, $$2, $$3, $$4) -> new elh($$0, $$1, $$2, $$3, $$4));
   }
}
