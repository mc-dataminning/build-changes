import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class egk extends egs {
   public static final MapCodec<egk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(efs.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, egk::new));
   private final efs c;

   private egk(efs $$0) {
      this.c = $$0;
   }

   public static egk a(efs $$0) {
      return new egk($$0);
   }

   public static egk a(dxp $$0, dxp $$1) {
      return a(efv.a($$0, $$1));
   }

   public static egk b(dxp $$0, dxp $$1) {
      return a(efu.a($$0, $$1));
   }

   @Override
   public Stream<io> a_(egq $$0, aym $$1, io $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public egt<?> b() {
      return egt.l;
   }
}
