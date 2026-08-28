import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enc extends enp {
   public static final MapCodec<enc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eev.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, enc::new)
   );
   private final eev c;

   private enc(eev $$0) {
      this.c = $$0;
   }

   public static enc a(eev $$0) {
      return new enc($$0);
   }

   @Override
   protected boolean a(eno $$0, azh $$1, ji $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public enr<?> b() {
      return enr.a;
   }
}
