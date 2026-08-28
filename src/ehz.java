import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehz extends ehx {
   public static final MapCodec<ehz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpi.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bpi.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ehz::new)
   );
   private final bpi c;
   private final bpi d;

   public static ehz a(bpi $$0, bpi $$1) {
      return new ehz($$0, $$1);
   }

   public static ehz a(bpi $$0) {
      return new ehz(bpf.a(0), $$0);
   }

   public static ehz b(bpi $$0) {
      return new ehz($$0, bpf.a(0));
   }

   private ehz(bpi $$0, bpi $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ja> a_(ehv $$0, aym $$1, ja $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ja($$3, $$4, $$5));
   }

   @Override
   public ehy<?> b() {
      return ehy.n;
   }
}
