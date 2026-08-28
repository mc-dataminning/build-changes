import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqw extends erj {
   public static final MapCodec<eqw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eim.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eqw::new)
   );
   private final eim c;

   private eqw(eim $$0) {
      this.c = $$0;
   }

   public static eqw a(eim $$0) {
      return new eqw($$0);
   }

   @Override
   protected boolean a(eri $$0, azz $$1, iw $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public erl<?> b() {
      return erl.a;
   }
}
