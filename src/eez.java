import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eez extends efm {
   public static final Codec<eez> a = RecordCodecBuilder.create($$0 -> $$0.group(dwx.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eez::new));
   private final dwx c;

   private eez(dwx $$0) {
      this.c = $$0;
   }

   public static eez a(dwx $$0) {
      return new eez($$0);
   }

   @Override
   protected boolean a(efl $$0, ayd $$1, im $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public efo<?> b() {
      return efo.a;
   }
}
