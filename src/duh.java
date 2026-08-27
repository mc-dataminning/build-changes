import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class duh extends duf {
   public static final Codec<duh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfv.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bfv.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, duh::new)
   );
   private final bfv c;
   private final bfv d;

   public static duh a(bfv $$0, bfv $$1) {
      return new duh($$0, $$1);
   }

   public static duh a(bfv $$0) {
      return new duh(bfs.a(0), $$0);
   }

   public static duh b(bfv $$0) {
      return new duh($$0, bfs.a(0));
   }

   private duh(bfv $$0, bfv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<gu> a_(dud $$0, aru $$1, gu $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new gu($$3, $$4, $$5));
   }

   @Override
   public dug<?> b() {
      return dug.n;
   }
}
