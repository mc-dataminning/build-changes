import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fau extends fbb {
   public static final MapCodec<fau> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, fau::new));

   private fau(int $$0, int $$1, List<fds> $$2, List<fbx> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public fba a() {
      return fax.b;
   }

   @Override
   public void a(Consumer<daa> $$0, faj $$1) {
   }

   public static fbb.a<?> b() {
      return a(fau::new);
   }
}
