import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erw extends esd {
   public static final MapCodec<erw> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, erw::new));

   private erw(int $$0, int $$1, List<euw> $$2, List<esz> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public esc a() {
      return erz.b;
   }

   @Override
   public void a(Consumer<cuo> $$0, erl $$1) {
   }

   public static esd.a<?> b() {
      return a(erw::new);
   }
}
