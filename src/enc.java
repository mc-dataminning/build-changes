import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enc extends enp {
   public static final MapCodec<enc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eew.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, enc::new)
   );
   private final eew c;

   private enc(eew $$0) {
      this.c = $$0;
   }

   public static enc a(eew $$0) {
      return new enc($$0);
   }

   @Override
   protected boolean a(eno $$0, bam $$1, jh $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public enr<?> b() {
      return enr.a;
   }
}
