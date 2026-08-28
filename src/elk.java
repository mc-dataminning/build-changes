import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class elk extends eli {
   public static final MapCodec<elk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brm.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), brm.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, elk::new)
   );
   private final brm c;
   private final brm d;

   public static elk a(brm $$0, brm $$1) {
      return new elk($$0, $$1);
   }

   public static elk a(brm $$0) {
      return new elk(brj.a(0), $$0);
   }

   public static elk b(brm $$0) {
      return new elk($$0, brj.a(0));
   }

   private elk(brm $$0, brm $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<jh> a_(elg $$0, azv $$1, jh $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new jh($$3, $$4, $$5));
   }

   @Override
   public elj<?> b() {
      return elj.n;
   }
}
