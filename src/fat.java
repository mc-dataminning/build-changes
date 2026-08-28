import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fat extends fbb {
   public static final MapCodec<fat> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alk.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fat::new)
   );
   private final alk j;

   private fat(alk $$0, int $$1, int $$2, List<fds> $$3, List<fbx> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fba a() {
      return fax.e;
   }

   @Override
   public void a(Consumer<daa> $$0, faj $$1) {
      $$1.a(this.j, $$0);
   }

   public static fbb.a<?> a(alk $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fat($$0, $$1, $$2, $$3, $$4));
   }
}
