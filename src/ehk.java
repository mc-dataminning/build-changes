import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehk extends ehr {
   public static final Codec<ehk> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ehk::new));

   private ehk(int $$0, int $$1, List<ejv> $$2, List<eij> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public ehq a() {
      return ehn.b;
   }

   @Override
   public void a(Consumer<cmy> $$0, egw $$1) {
   }

   public static ehr.a<?> b() {
      return a(ehk::new);
   }
}
