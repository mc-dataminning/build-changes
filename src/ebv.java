import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebv extends eci {
   public static final Codec<ebv> a = RecordCodecBuilder.create($$0 -> $$0.group(dtt.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ebv::new));
   private final dtt c;

   private ebv(dtt $$0) {
      this.c = $$0;
   }

   public static ebv a(dtt $$0) {
      return new ebv($$0);
   }

   @Override
   protected boolean a(ech $$0, axd $$1, ib $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eck<?> b() {
      return eck.a;
   }
}
