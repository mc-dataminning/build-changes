import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewa extends ewi {
   public static final MapCodec<ewa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akv.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewa::new)
   );
   private final akv j;

   private ewa(akv $$0, int $$1, int $$2, List<eyz> $$3, List<exe> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewh a() {
      return ewe.e;
   }

   @Override
   public void a(Consumer<cwo> $$0, evq $$1) {
      $$1.a(this.j, $$0);
   }

   public static ewi.a<?> a(akv $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewa($$0, $$1, $$2, $$3, $$4));
   }
}
