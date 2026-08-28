import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eqa extends eqi {
   public static final MapCodec<eqa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(epi.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eqa::new));
   private final epi c;

   private eqa(epi $$0) {
      this.c = $$0;
   }

   public static eqa a(epi $$0) {
      return new eqa($$0);
   }

   public static eqa a(eha $$0, eha $$1) {
      return a(epl.a($$0, $$1));
   }

   public static eqa b(eha $$0, eha $$1) {
      return a(epk.a($$0, $$1));
   }

   @Override
   public Stream<iu> a_(eqg $$0, azv $$1, iu $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eqj<?> b() {
      return eqj.l;
   }
}
