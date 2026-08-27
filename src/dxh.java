import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxh extends dxu {
   public static final Codec<dxh> a = RecordCodecBuilder.create($$0 -> $$0.group(dpf.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dxh::new));
   private final dpf c;

   private dxh(dpf $$0) {
      this.c = $$0;
   }

   public static dxh a(dpf $$0) {
      return new dxh($$0);
   }

   @Override
   protected boolean a(dxt $$0, auf $$1, hv $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dxw<?> b() {
      return dxw.a;
   }
}
