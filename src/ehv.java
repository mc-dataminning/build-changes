import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehv extends eht {
   public static final MapCodec<ehv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqb.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bqb.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ehv::new)
   );
   private final bqb c;
   private final bqb d;

   public static ehv a(bqb $$0, bqb $$1) {
      return new ehv($$0, $$1);
   }

   public static ehv a(bqb $$0) {
      return new ehv(bpy.a(0), $$0);
   }

   public static ehv b(bqb $$0) {
      return new ehv($$0, bpy.a(0));
   }

   private ehv(bqb $$0, bqb $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iz> a_(ehr $$0, azh $$1, iz $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iz($$3, $$4, $$5));
   }

   @Override
   public ehu<?> b() {
      return ehu.n;
   }
}
