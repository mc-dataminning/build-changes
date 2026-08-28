import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ekq extends eky {
   public static final MapCodec<ekq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ejy.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ekq::new));
   private final ejy c;

   private ekq(ejy $$0) {
      this.c = $$0;
   }

   public static ekq a(ejy $$0) {
      return new ekq($$0);
   }

   public static ekq a(ebt $$0, ebt $$1) {
      return a(ekb.a($$0, $$1));
   }

   public static ekq b(ebt $$0, ebt $$1) {
      return a(eka.a($$0, $$1));
   }

   @Override
   public Stream<jg> a_(ekw $$0, azr $$1, jg $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ekz<?> b() {
      return ekz.l;
   }
}
