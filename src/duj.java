import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class duj extends dur {
   public static final Codec<duj> a = RecordCodecBuilder.create($$0 -> $$0.group(dtr.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, duj::new));
   private final dtr c;

   private duj(dtr $$0) {
      this.c = $$0;
   }

   public static duj a(dtr $$0) {
      return new duj($$0);
   }

   public static duj a(dlo $$0, dlo $$1) {
      return a(dtu.a($$0, $$1));
   }

   public static duj b(dlo $$0, dlo $$1) {
      return a(dtt.a($$0, $$1));
   }

   @Override
   public Stream<gw> a_(dup $$0, ase $$1, gw $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dus<?> b() {
      return dus.l;
   }
}
