import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eij extends eix {
   public static final MapCodec<eij> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eaf.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eij::new)
   );
   private final eaf c;

   private eij(eaf $$0) {
      this.c = $$0;
   }

   public static eij a(eaf $$0) {
      return new eij($$0);
   }

   @Override
   protected boolean a(eiw $$0, ayw $$1, jd $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eiz<?> b() {
      return eiz.a;
   }
}
