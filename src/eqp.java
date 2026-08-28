import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqp extends eqk {
   public static final MapCodec<eqp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btd.b(eqk.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, eqp::new)
   );
   private final btd<eqk> b;

   public eqp(btd<eqk> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azz $$0, eic $$1) {
      return this.b.b($$0).a($$0, $$1);
   }

   @Override
   public eql<?> a() {
      return eql.f;
   }
}
