import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emj extends emr {
   public static final MapCodec<emj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(elr.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, emj::new));
   private final elr c;

   private emj(elr $$0) {
      this.c = $$0;
   }

   public static emj a(elr $$0) {
      return new emj($$0);
   }

   public static emj a(edk $$0, edk $$1) {
      return a(elu.a($$0, $$1));
   }

   public static emj b(edk $$0, edk $$1) {
      return a(elt.a($$0, $$1));
   }

   @Override
   public Stream<ji> a_(emp $$0, azg $$1, ji $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ems<?> b() {
      return ems.l;
   }
}
