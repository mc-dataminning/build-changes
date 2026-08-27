import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class enx extends eof {
   public static final Codec<enx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajv.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, enx::new)
   );
   private final ajv j;

   private enx(ajv $$0, int $$1, int $$2, List<eql> $$3, List<eoy> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eoe a() {
      return eob.e;
   }

   @Override
   public void a(Consumer<crs> $$0, enk $$1) {
      $$1.a(this.j, $$0);
   }

   public static eof.a<?> a(ajv $$0) {
      return a(($$1, $$2, $$3, $$4) -> new enx($$0, $$1, $$2, $$3, $$4));
   }
}
