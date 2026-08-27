import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eep extends eex {
   public static final Codec<eep> a = RecordCodecBuilder.create($$0 -> $$0.group(edx.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eep::new));
   private final edx c;

   private eep(edx $$0) {
      this.c = $$0;
   }

   public static eep a(edx $$0) {
      return new eep($$0);
   }

   public static eep a(dvu $$0, dvu $$1) {
      return a(eea.a($$0, $$1));
   }

   public static eep b(dvu $$0, dvu $$1) {
      return a(edz.a($$0, $$1));
   }

   @Override
   public Stream<id> a_(eev $$0, axt $$1, id $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eey<?> b() {
      return eey.l;
   }
}
