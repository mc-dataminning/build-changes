import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dtx extends duf {
   public static final Codec<dtx> a = RecordCodecBuilder.create($$0 -> $$0.group(dtf.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dtx::new));
   private final dtf c;

   private dtx(dtf $$0) {
      this.c = $$0;
   }

   public static dtx a(dtf $$0) {
      return new dtx($$0);
   }

   public static dtx a(dlc $$0, dlc $$1) {
      return a(dti.a($$0, $$1));
   }

   public static dtx b(dlc $$0, dlc $$1) {
      return a(dth.a($$0, $$1));
   }

   @Override
   public Stream<gu> a_(dud $$0, aru $$1, gu $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dug<?> b() {
      return dug.l;
   }
}
