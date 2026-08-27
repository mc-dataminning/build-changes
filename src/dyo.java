import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyo extends dym {
   public static final Codec<dyo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bjf.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bjf.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dyo::new)
   );
   private final bjf c;
   private final bjf d;

   public static dyo a(bjf $$0, bjf $$1) {
      return new dyo($$0, $$1);
   }

   public static dyo a(bjf $$0) {
      return new dyo(bjc.a(0), $$0);
   }

   public static dyo b(bjf $$0) {
      return new dyo($$0, bjc.a(0));
   }

   private dyo(bjf $$0, bjf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<hx> a_(dyk $$0, auu $$1, hx $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new hx($$3, $$4, $$5));
   }

   @Override
   public dyn<?> b() {
      return dyn.n;
   }
}
