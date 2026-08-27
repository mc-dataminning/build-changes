import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eny extends eof {
   public static final Codec<eny> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, eny::new));

   private eny(int $$0, int $$1, List<eql> $$2, List<eoy> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eoe a() {
      return eob.b;
   }

   @Override
   public void a(Consumer<crs> $$0, enk $$1) {
   }

   public static eof.a<?> b() {
      return a(eny::new);
   }
}
