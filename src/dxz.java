import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxz extends dym {
   public static final Codec<dxz> a = RecordCodecBuilder.create($$0 -> $$0.group(dpx.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dxz::new));
   private final dpx c;

   private dxz(dpx $$0) {
      this.c = $$0;
   }

   public static dxz a(dpx $$0) {
      return new dxz($$0);
   }

   @Override
   protected boolean a(dyl $$0, auv $$1, hx $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dyo<?> b() {
      return dyo.a;
   }
}
