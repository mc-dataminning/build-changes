import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fas extends faz {
   public static final MapCodec<fas> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, fas::new));

   private fas(int $$0, int $$1, List<fdq> $$2, List<fbv> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public fay a() {
      return fav.b;
   }

   @Override
   public void a(Consumer<czy> $$0, fah $$1) {
   }

   public static faz.a<?> b() {
      return a(fas::new);
   }
}
