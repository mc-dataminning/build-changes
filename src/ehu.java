import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehu extends ehs {
   public static final MapCodec<ehu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqa.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bqa.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ehu::new)
   );
   private final bqa c;
   private final bqa d;

   public static ehu a(bqa $$0, bqa $$1) {
      return new ehu($$0, $$1);
   }

   public static ehu a(bqa $$0) {
      return new ehu(bpx.a(0), $$0);
   }

   public static ehu b(bqa $$0) {
      return new ehu($$0, bpx.a(0));
   }

   private ehu(bqa $$0, bqa $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iz> a_(ehq $$0, azh $$1, iz $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iz($$3, $$4, $$5));
   }

   @Override
   public eht<?> b() {
      return eht.n;
   }
}
