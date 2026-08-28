import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewa extends ewh {
   public static final MapCodec<ewa> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ewa::new));

   private ewa(int $$0, int $$1, List<eyy> $$2, List<exd> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ewg a() {
      return ewd.b;
   }

   @Override
   public void a(Consumer<cwn> $$0, evp $$1) {
   }

   public static ewh.a<?> b() {
      return a(ewa::new);
   }
}
