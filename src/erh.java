import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erh extends ero {
   public static final MapCodec<erh> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, erh::new));

   private erh(int $$0, int $$1, List<euh> $$2, List<esk> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ern a() {
      return erk.b;
   }

   @Override
   public void a(Consumer<cud> $$0, eqw $$1) {
   }

   public static ero.a<?> b() {
      return a(erh::new);
   }
}
