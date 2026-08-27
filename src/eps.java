import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eps extends epz {
   public static final MapCodec<eps> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eps::new));

   private eps(int $$0, int $$1, List<esn> $$2, List<eqt> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public epy a() {
      return epv.b;
   }

   @Override
   public void a(Consumer<ctq> $$0, eph $$1) {
   }

   public static epz.a<?> b() {
      return a(eps::new);
   }
}
