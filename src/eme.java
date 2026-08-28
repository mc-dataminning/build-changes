import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eme extends emr {
   public static final MapCodec<eme> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edy.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eme::new)
   );
   private final edy c;

   private eme(edy $$0) {
      this.c = $$0;
   }

   public static eme a(edy $$0) {
      return new eme($$0);
   }

   @Override
   protected boolean a(emq $$0, azh $$1, ji $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public emt<?> b() {
      return emt.a;
   }
}
