import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class env extends enp {
   public static final MapCodec<env> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               edo.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c),
               Codec.INT.optionalFieldOf("min_inclusive", Integer.MIN_VALUE).forGetter($$0x -> $$0x.d),
               Codec.INT.optionalFieldOf("max_inclusive", Integer.MAX_VALUE).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, env::new)
   );
   private final edo.a c;
   private final int d;
   private final int e;

   private env(edo.a $$0, int $$1, int $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static env a(edo.a $$0, int $$1, int $$2) {
      return new env($$0, $$1, $$2);
   }

   @Override
   protected boolean a(eno $$0, azh $$1, ji $$2) {
      long $$3 = (long)$$0.a(this.c, $$2.u(), $$2.w());
      long $$4 = $$3 + (long)this.d;
      long $$5 = $$3 + (long)this.e;
      return $$4 <= (long)$$2.v() && (long)$$2.v() <= $$5;
   }

   @Override
   public enr<?> b() {
      return enr.c;
   }
}
