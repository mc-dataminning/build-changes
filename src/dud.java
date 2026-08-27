import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dud extends duj {
   private static final dud c = new dud();
   public static final Codec<dud> a = Codec.unit(() -> c);

   public static dud a() {
      return c;
   }

   @Override
   public Stream<gw> a_(duh $$0, ash $$1, gw $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new gw($$3, $$2.v(), $$4));
   }

   @Override
   public duk<?> b() {
      return duk.m;
   }
}
