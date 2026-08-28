import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eyy extends ezf {
   public static final MapCodec<eyy> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eyy::new));

   private eyy(int $$0, int $$1, List<fbw> $$2, List<fab> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eze a() {
      return ezb.b;
   }

   @Override
   public void a(Consumer<cys> $$0, eyn $$1) {
   }

   public static ezf.a<?> b() {
      return a(eyy::new);
   }
}
