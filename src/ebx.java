import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebx extends eck {
   public static final Codec<ebx> a = RecordCodecBuilder.create($$0 -> $$0.group(dtv.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ebx::new));
   private final dtv c;

   private ebx(dtv $$0) {
      this.c = $$0;
   }

   public static ebx a(dtv $$0) {
      return new ebx($$0);
   }

   @Override
   protected boolean a(ecj $$0, axd $$1, ib $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ecm<?> b() {
      return ecm.a;
   }
}
