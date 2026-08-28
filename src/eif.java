import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eif extends eis {
   public static final MapCodec<eif> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eac.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eif::new)
   );
   private final eac c;

   private eif(eac $$0) {
      this.c = $$0;
   }

   public static eif a(eac $$0) {
      return new eif($$0);
   }

   @Override
   protected boolean a(eir $$0, ayv $$1, jd $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eiu<?> b() {
      return eiu.a;
   }
}
