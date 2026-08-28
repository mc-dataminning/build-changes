import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eii extends eiv {
   public static final MapCodec<eii> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eaf.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eii::new)
   );
   private final eaf c;

   private eii(eaf $$0) {
      this.c = $$0;
   }

   public static eii a(eaf $$0) {
      return new eii($$0);
   }

   @Override
   protected boolean a(eiu $$0, ayw $$1, jd $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eix<?> b() {
      return eix.a;
   }
}
