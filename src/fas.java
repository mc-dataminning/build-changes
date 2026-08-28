import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fas(deg b) implements fau {
   public static final MapCodec<fas> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deg.b.fieldOf("amount").forGetter(fas::c)).apply($$0, fas::new));

   @Override
   public float b(ewp $$0) {
      int $$1 = $$0.b(ezj.k);
      return this.b.a($$1);
   }

   @Override
   public fat b() {
      return fav.g;
   }

   public static fas a(deg $$0) {
      return new fas($$0);
   }

   public deg c() {
      return this.b;
   }
}
