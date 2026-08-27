import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ean extends eal {
   public static final Codec<ean> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bkz.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bkz.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ean::new)
   );
   private final bkz c;
   private final bkz d;

   public static ean a(bkz $$0, bkz $$1) {
      return new ean($$0, $$1);
   }

   public static ean a(bkz $$0) {
      return new ean(bkw.a(0), $$0);
   }

   public static ean b(bkz $$0) {
      return new ean($$0, bkw.a(0));
   }

   private ean(bkz $$0, bkz $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<hz> a_(eaj $$0, awo $$1, hz $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new hz($$3, $$4, $$5));
   }

   @Override
   public eam<?> b() {
      return eam.n;
   }
}
