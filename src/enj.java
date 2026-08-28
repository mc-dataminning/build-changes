import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class enj extends enr {
   public static final MapCodec<enj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(emr.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, enj::new));
   private final emr c;

   private enj(emr $$0) {
      this.c = $$0;
   }

   public static enj a(emr $$0) {
      return new enj($$0);
   }

   public static enj a(eek $$0, eek $$1) {
      return a(emu.a($$0, $$1));
   }

   public static enj b(eek $$0, eek $$1) {
      return a(emt.a($$0, $$1));
   }

   @Override
   public Stream<jh> a_(enp $$0, bam $$1, jh $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ens<?> b() {
      return ens.l;
   }
}
