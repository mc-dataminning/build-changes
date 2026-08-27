import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dts extends duf {
   public static final Codec<dts> a = RecordCodecBuilder.create($$0 -> $$0.group(dlq.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dts::new));
   private final dlq c;

   private dts(dlq $$0) {
      this.c = $$0;
   }

   public static dts a(dlq $$0) {
      return new dts($$0);
   }

   @Override
   protected boolean a(due $$0, aru $$1, gu $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public duh<?> b() {
      return duh.a;
   }
}
