import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eml extends emt {
   public static final MapCodec<eml> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(elt.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eml::new));
   private final elt c;

   private eml(elt $$0) {
      this.c = $$0;
   }

   public static eml a(elt $$0) {
      return new eml($$0);
   }

   public static eml a(edm $$0, edm $$1) {
      return a(elw.a($$0, $$1));
   }

   public static eml b(edm $$0, edm $$1) {
      return a(elv.a($$0, $$1));
   }

   @Override
   public Stream<ji> a_(emr $$0, azh $$1, ji $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public emu<?> b() {
      return emu.l;
   }
}
