import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ekf extends ekn {
   public static final MapCodec<ekf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ejn.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ekf::new));
   private final ejn c;

   private ekf(ejn $$0) {
      this.c = $$0;
   }

   public static ekf a(ejn $$0) {
      return new ekf($$0);
   }

   public static ekf a(ebi $$0, ebi $$1) {
      return a(ejq.a($$0, $$1));
   }

   public static ekf b(ebi $$0, ebi $$1) {
      return a(ejp.a($$0, $$1));
   }

   @Override
   public Stream<jf> a_(ekl $$0, azn $$1, jf $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eko<?> b() {
      return eko.l;
   }
}
