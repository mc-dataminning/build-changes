import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eow extends epd {
   public static final Codec<eow> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, eow::new));

   private eow(int $$0, int $$1, List<erq> $$2, List<epx> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public epc a() {
      return eoz.b;
   }

   @Override
   public void a(Consumer<csz> $$0, eol $$1) {
   }

   public static epd.a<?> b() {
      return a(eow::new);
   }
}
