import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehb extends eho {
   public static final MapCodec<ehb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyz.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ehb::new)
   );
   private final dyz c;

   private ehb(dyz $$0) {
      this.c = $$0;
   }

   public static ehb a(dyz $$0) {
      return new ehb($$0);
   }

   @Override
   protected boolean a(ehn $$0, azf $$1, iz $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ehq<?> b() {
      return ehq.a;
   }
}
