import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ege extends egr {
   public static final MapCodec<ege> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyc.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ege::new)
   );
   private final dyc c;

   private ege(dyc $$0) {
      this.c = $$0;
   }

   public static ege a(dyc $$0) {
      return new ege($$0);
   }

   @Override
   protected boolean a(egq $$0, aym $$1, io $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public egt<?> b() {
      return egt.a;
   }
}
