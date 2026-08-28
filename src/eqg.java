import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqg extends eqt {
   public static final MapCodec<eqg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehz.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eqg::new)
   );
   private final ehz c;

   private eqg(ehz $$0) {
      this.c = $$0;
   }

   public static eqg a(ehz $$0) {
      return new eqg($$0);
   }

   @Override
   protected boolean a(eqs $$0, azv $$1, iv $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eqv<?> b() {
      return eqv.a;
   }
}
