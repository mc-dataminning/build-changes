import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ezs extends ezz {
   public static final MapCodec<ezs> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ezs::new));

   private ezs(int $$0, int $$1, List<fcq> $$2, List<fav> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ezy a() {
      return ezv.b;
   }

   @Override
   public void a(Consumer<czd> $$0, ezh $$1) {
   }

   public static ezz.a<?> b() {
      return a(ezs::new);
   }
}
