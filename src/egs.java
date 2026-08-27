import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class egs extends egz {
   public static final Codec<egs> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, egs::new));

   private egs(int $$0, int $$1, List<ejd> $$2, List<ehr> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public egy a() {
      return egv.b;
   }

   @Override
   public void a(Consumer<cmh> $$0, ege $$1) {
   }

   public static egz.a<?> b() {
      return a(egs::new);
   }
}
