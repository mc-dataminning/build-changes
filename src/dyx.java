import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyx extends dyv {
   public static final Codec<dyx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bjh.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bjh.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dyx::new)
   );
   private final bjh c;
   private final bjh d;

   public static dyx a(bjh $$0, bjh $$1) {
      return new dyx($$0, $$1);
   }

   public static dyx a(bjh $$0) {
      return new dyx(bje.a(0), $$0);
   }

   public static dyx b(bjh $$0) {
      return new dyx($$0, bje.a(0));
   }

   private dyx(bjh $$0, bjh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<hx> a_(dyt $$0, auw $$1, hx $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new hx($$3, $$4, $$5));
   }

   @Override
   public dyw<?> b() {
      return dyw.n;
   }
}
