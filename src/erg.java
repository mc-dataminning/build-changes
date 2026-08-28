import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class erg extends ert {
   public static final MapCodec<erg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eiw.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, erg::new)
   );
   private final eiw c;

   private erg(eiw $$0) {
      this.c = $$0;
   }

   public static erg a(eiw $$0) {
      return new erg($$0);
   }

   @Override
   protected boolean a(ers $$0, bai $$1, iw $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public erv<?> b() {
      return erv.a;
   }
}
