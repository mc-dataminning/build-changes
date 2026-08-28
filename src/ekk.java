import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekk extends ekx {
   public static final MapCodec<ekk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecg.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ekk::new)
   );
   private final ecg c;

   private ekk(ecg $$0) {
      this.c = $$0;
   }

   public static ekk a(ecg $$0) {
      return new ekk($$0);
   }

   @Override
   protected boolean a(ekw $$0, azr $$1, jg $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ekz<?> b() {
      return ekz.a;
   }
}
