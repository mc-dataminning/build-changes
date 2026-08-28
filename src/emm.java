import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emm extends emu {
   public static final MapCodec<emm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(elu.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, emm::new));
   private final elu c;

   private emm(elu $$0) {
      this.c = $$0;
   }

   public static emm a(elu $$0) {
      return new emm($$0);
   }

   public static emm a(edn $$0, edn $$1) {
      return a(elx.a($$0, $$1));
   }

   public static emm b(edn $$0, edn $$1) {
      return a(elw.a($$0, $$1));
   }

   @Override
   public Stream<ji> a_(ems $$0, azh $$1, ji $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public emv<?> b() {
      return emv.l;
   }
}
