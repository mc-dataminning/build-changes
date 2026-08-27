import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class duz extends dvh {
   public static final Codec<duz> a = RecordCodecBuilder.create($$0 -> $$0.group(duh.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, duz::new));
   private final duh c;

   private duz(duh $$0) {
      this.c = $$0;
   }

   public static duz a(duh $$0) {
      return new duz($$0);
   }

   public static duz a(dme $$0, dme $$1) {
      return a(duk.a($$0, $$1));
   }

   public static duz b(dme $$0, dme $$1) {
      return a(duj.a($$0, $$1));
   }

   @Override
   public Stream<ht> a_(dvf $$0, ate $$1, ht $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dvi<?> b() {
      return dvi.l;
   }
}
