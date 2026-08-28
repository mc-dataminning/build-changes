import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elb extends elo {
   public static final MapCodec<elb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecx.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, elb::new)
   );
   private final ecx c;

   private elb(ecx $$0) {
      this.c = $$0;
   }

   public static elb a(ecx $$0) {
      return new elb($$0);
   }

   @Override
   protected boolean a(eln $$0, azu $$1, jh $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public elq<?> b() {
      return elq.a;
   }
}
