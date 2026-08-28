import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eig extends eie {
   public static final MapCodec<eig> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpm.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bpm.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eig::new)
   );
   private final bpm c;
   private final bpm d;

   public static eig a(bpm $$0, bpm $$1) {
      return new eig($$0, $$1);
   }

   public static eig a(bpm $$0) {
      return new eig(bpj.a(0), $$0);
   }

   public static eig b(bpm $$0) {
      return new eig($$0, bpj.a(0));
   }

   private eig(bpm $$0, bpm $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ja> a_(eic $$0, ayo $$1, ja $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ja($$3, $$4, $$5));
   }

   @Override
   public eif<?> b() {
      return eif.n;
   }
}
