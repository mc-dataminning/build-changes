import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dum extends duk {
   public static final Codec<dum> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfy.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bfy.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dum::new)
   );
   private final bfy c;
   private final bfy d;

   public static dum a(bfy $$0, bfy $$1) {
      return new dum($$0, $$1);
   }

   public static dum a(bfy $$0) {
      return new dum(bfv.a(0), $$0);
   }

   public static dum b(bfy $$0) {
      return new dum($$0, bfv.a(0));
   }

   private dum(bfy $$0, bfy $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<gw> a_(dui $$0, arx $$1, gw $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new gw($$3, $$4, $$5));
   }

   @Override
   public dul<?> b() {
      return dul.n;
   }
}
