import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dvb extends dvh {
   private static final dvb c = new dvb();
   public static final Codec<dvb> a = Codec.unit(() -> c);

   public static dvb a() {
      return c;
   }

   @Override
   public Stream<ht> a_(dvf $$0, ate $$1, ht $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ht($$3, $$2.v(), $$4));
   }

   @Override
   public dvi<?> b() {
      return dvi.m;
   }
}
