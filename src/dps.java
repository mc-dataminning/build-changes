import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dps extends dvy implements duy {
   protected static final MapCodec<dcm> b = dcm.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dps> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dps::c), t()).apply($$0, dps::new));
   private static final ffr a = dmm.b(6.0, 0.0, 10.0);
   private final dcm d;

   @Override
   public MapCodec<? extends dps> a() {
      return c;
   }

   public dps(jf<bvk> $$0, float $$1, ean.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dps(dcm $$0, ean.d $$1) {
      super($$1);
      this.d = $$0;
   }

   protected static dcm a(jf<bvk> $$0, float $$1) {
      return new dcm(List.of(new dcm.a($$0, azm.d($$1 * 20.0F))));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return a.a($$0.a($$2));
   }

   @Override
   public dcm c() {
      return this.d;
   }

   @Nullable
   public bvm b() {
      return null;
   }
}
