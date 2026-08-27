import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dty extends dug {
   public static final Codec<dty> a = RecordCodecBuilder.create($$0 -> $$0.group(dtg.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dty::new));
   private final dtg c;

   private dty(dtg $$0) {
      this.c = $$0;
   }

   public static dty a(dtg $$0) {
      return new dty($$0);
   }

   public static dty a(dld $$0, dld $$1) {
      return a(dtj.a($$0, $$1));
   }

   public static dty b(dld $$0, dld $$1) {
      return a(dti.a($$0, $$1));
   }

   @Override
   public Stream<gu> a_(due $$0, aru $$1, gu $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public duh<?> b() {
      return duh.l;
   }
}
