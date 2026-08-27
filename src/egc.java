import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egc extends egp {
   public static final MapCodec<egc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dya.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, egc::new)
   );
   private final dya c;

   private egc(dya $$0) {
      this.c = $$0;
   }

   public static egc a(dya $$0) {
      return new egc($$0);
   }

   @Override
   protected boolean a(ego $$0, ayk $$1, io $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public egr<?> b() {
      return egr.a;
   }
}
