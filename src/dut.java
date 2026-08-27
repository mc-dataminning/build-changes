import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dut extends dur {
   public static final Codec<dut> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bgf.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bgf.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dut::new)
   );
   private final bgf c;
   private final bgf d;

   public static dut a(bgf $$0, bgf $$1) {
      return new dut($$0, $$1);
   }

   public static dut a(bgf $$0) {
      return new dut(bgc.a(0), $$0);
   }

   public static dut b(bgf $$0) {
      return new dut($$0, bgc.a(0));
   }

   private dut(bgf $$0, bgf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<gw> a_(dup $$0, ase $$1, gw $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new gw($$3, $$4, $$5));
   }

   @Override
   public dus<?> b() {
      return dus.n;
   }
}
