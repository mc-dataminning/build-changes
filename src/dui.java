import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dui extends dug {
   public static final Codec<dui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfv.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bfv.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dui::new)
   );
   private final bfv c;
   private final bfv d;

   public static dui a(bfv $$0, bfv $$1) {
      return new dui($$0, $$1);
   }

   public static dui a(bfv $$0) {
      return new dui(bfs.a(0), $$0);
   }

   public static dui b(bfv $$0) {
      return new dui($$0, bfs.a(0));
   }

   private dui(bfv $$0, bfv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<gu> a_(due $$0, aru $$1, gu $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new gu($$3, $$4, $$5));
   }

   @Override
   public duh<?> b() {
      return duh.n;
   }
}
