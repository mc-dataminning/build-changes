import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doh extends dog {
   public static final MapCodec<doh> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mb.e.q().fieldOf("host").forGetter(dog::b), t()).apply($$0, doh::new));

   @Override
   public MapCodec<doh> a() {
      return b;
   }

   public doh(dke $$0, dxp.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dqv.d, jn.a.b));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return dqv.b($$0, $$1);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(dqv.d);
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(dqv.d, $$0.k().o());
   }
}
