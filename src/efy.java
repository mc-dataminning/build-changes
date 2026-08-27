import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class efy extends efw {
   public static final Codec<efy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bor.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bor.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, efy::new)
   );
   private final bor c;
   private final bor d;

   public static efy a(bor $$0, bor $$1) {
      return new efy($$0, $$1);
   }

   public static efy a(bor $$0) {
      return new efy(boo.a(0), $$0);
   }

   public static efy b(bor $$0) {
      return new efy($$0, boo.a(0));
   }

   private efy(bor $$0, bor $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<in> a_(efu $$0, ayg $$1, in $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new in($$3, $$4, $$5));
   }

   @Override
   public efx<?> b() {
      return efx.n;
   }
}
