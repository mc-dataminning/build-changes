import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class efo extends efw {
   public static final Codec<efo> a = RecordCodecBuilder.create($$0 -> $$0.group(eew.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, efo::new));
   private final eew c;

   private efo(eew $$0) {
      this.c = $$0;
   }

   public static efo a(eew $$0) {
      return new efo($$0);
   }

   public static efo a(dwt $$0, dwt $$1) {
      return a(eez.a($$0, $$1));
   }

   public static efo b(dwt $$0, dwt $$1) {
      return a(eey.a($$0, $$1));
   }

   @Override
   public Stream<in> a_(efu $$0, ayg $$1, in $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public efx<?> b() {
      return efx.l;
   }
}
