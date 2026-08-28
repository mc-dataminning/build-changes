import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class equ extends erh {
   public static final MapCodec<equ> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eik.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, equ::new)
   );
   private final eik c;

   private equ(eik $$0) {
      this.c = $$0;
   }

   public static equ a(eik $$0) {
      return new equ($$0);
   }

   @Override
   protected boolean a(erg $$0, azx $$1, iv $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public erj<?> b() {
      return erj.a;
   }
}
