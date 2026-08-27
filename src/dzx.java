import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzx extends eak {
   public static final Codec<dzx> a = RecordCodecBuilder.create($$0 -> $$0.group(drv.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dzx::new));
   private final drv c;

   private dzx(drv $$0) {
      this.c = $$0;
   }

   public static dzx a(drv $$0) {
      return new dzx($$0);
   }

   @Override
   protected boolean a(eaj $$0, awo $$1, hz $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eam<?> b() {
      return eam.a;
   }
}
