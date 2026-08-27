import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxs extends dyf {
   public static final Codec<dxs> a = RecordCodecBuilder.create($$0 -> $$0.group(dpq.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dxs::new));
   private final dpq c;

   private dxs(dpq $$0) {
      this.c = $$0;
   }

   public static dxs a(dpq $$0) {
      return new dxs($$0);
   }

   @Override
   protected boolean a(dye $$0, aup $$1, hx $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dyh<?> b() {
      return dyh.a;
   }
}
