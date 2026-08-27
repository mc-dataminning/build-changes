import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dwi extends dwo {
   private static final dwi c = new dwi();
   public static final Codec<dwi> a = Codec.unit(() -> c);

   public static dwi a() {
      return c;
   }

   @Override
   public Stream<ht> a_(dwm $$0, ats $$1, ht $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ht($$3, $$2.v(), $$4));
   }

   @Override
   public dwp<?> b() {
      return dwp.m;
   }
}
