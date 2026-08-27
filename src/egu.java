import com.mojang.serialization.Codec;

public class egu extends egl {
   public static final Codec<egu> b = dtc.b.fieldOf("state").xmap(egu::new, $$0 -> $$0.c).codec();
   private final dtc c;

   protected egu(dtc $$0) {
      this.c = $$0;
   }

   @Override
   protected egm<?> a() {
      return egm.a;
   }

   @Override
   public dtc a(ayt $$0, ir $$1) {
      return this.c;
   }
}
