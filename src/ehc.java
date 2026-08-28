import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehc extends ehp {
   public static final MapCodec<ehc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dza.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ehc::new)
   );
   private final dza c;

   private ehc(dza $$0) {
      this.c = $$0;
   }

   public static ehc a(dza $$0) {
      return new ehc($$0);
   }

   @Override
   protected boolean a(eho $$0, azg $$1, iz $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ehr<?> b() {
      return ehr.a;
   }
}
