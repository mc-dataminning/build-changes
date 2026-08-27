import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class duc extends duk {
   public static final Codec<duc> a = RecordCodecBuilder.create($$0 -> $$0.group(dtk.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, duc::new));
   private final dtk c;

   private duc(dtk $$0) {
      this.c = $$0;
   }

   public static duc a(dtk $$0) {
      return new duc($$0);
   }

   public static duc a(dlh $$0, dlh $$1) {
      return a(dtn.a($$0, $$1));
   }

   public static duc b(dlh $$0, dlh $$1) {
      return a(dtm.a($$0, $$1));
   }

   @Override
   public Stream<gw> a_(dui $$0, arx $$1, gw $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dul<?> b() {
      return dul.l;
   }
}
