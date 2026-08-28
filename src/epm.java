import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epm extends epz {
   public static final MapCodec<epm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehf.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, epm::new)
   );
   private final ehf c;

   private epm(ehf $$0) {
      this.c = $$0;
   }

   public static epm a(ehf $$0) {
      return new epm($$0);
   }

   @Override
   protected boolean a(epy $$0, azv $$1, iu $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eqb<?> b() {
      return eqb.a;
   }
}
