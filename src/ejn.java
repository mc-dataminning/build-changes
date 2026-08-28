import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ejn extends ejv {
   public static final MapCodec<ejn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eiv.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ejn::new));
   private final eiv c;

   private ejn(eiv $$0) {
      this.c = $$0;
   }

   public static ejn a(eiv $$0) {
      return new ejn($$0);
   }

   public static ejn a(eaq $$0, eaq $$1) {
      return a(eiy.a($$0, $$1));
   }

   public static ejn b(eaq $$0, eaq $$1) {
      return a(eix.a($$0, $$1));
   }

   @Override
   public Stream<je> a_(ejt $$0, azk $$1, je $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ejw<?> b() {
      return ejw.l;
   }
}
