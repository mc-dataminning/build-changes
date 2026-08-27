import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehd extends ehk {
   public static final Codec<ehd> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ehd::new));

   private ehd(int $$0, int $$1, List<ejo> $$2, List<eic> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ehj a() {
      return ehg.b;
   }

   @Override
   public void a(Consumer<cmr> $$0, egp $$1) {
   }

   public static ehk.a<?> b() {
      return a(ehd::new);
   }
}
