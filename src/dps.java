import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dps extends dop {
   public static final MapCodec<dps> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azd.m.fieldOf("chance").forGetter($$0x -> $$0x.h), ls.bi.fieldOf("particle").forGetter($$0x -> $$0x.g), t()).apply($$0, dps::new)
   );
   private final lq g;
   private final int h;

   @Override
   public MapCodec<dps> a() {
      return f;
   }

   public dps(int $$0, lq $$1, dxn.d $$2) {
      super($$2);
      this.h = $$0;
      this.g = $$1;
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(this.h) == 0) {
         jh $$4 = $$2.e();
         dxo $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jm.b)) {
            azy.a($$1, $$2, $$3, this.g);
         }
      }
   }
}
