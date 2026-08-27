import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class egi extends egq {
   public static final MapCodec<egi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(efq.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, egi::new));
   private final efq c;

   private egi(efq $$0) {
      this.c = $$0;
   }

   public static egi a(efq $$0) {
      return new egi($$0);
   }

   public static egi a(dxn $$0, dxn $$1) {
      return a(eft.a($$0, $$1));
   }

   public static egi b(dxn $$0, dxn $$1) {
      return a(efs.a($$0, $$1));
   }

   @Override
   public Stream<io> a_(ego $$0, ayk $$1, io $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public egr<?> b() {
      return egr.l;
   }
}
