import com.mojang.serialization.MapCodec;

public class enh extends emy {
   public static final MapCodec<enh> b = dzo.a.fieldOf("state").xmap(enh::new, $$0 -> $$0.c);
   private final dzo c;

   protected enh(dzo $$0) {
      this.c = $$0;
   }

   @Override
   protected emz<?> a() {
      return emz.a;
   }

   @Override
   public dzo a(azt $$0, iu $$1) {
      return this.c;
   }
}
