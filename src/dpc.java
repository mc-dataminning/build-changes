import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpc extends dnz {
   public static final MapCodec<dpc> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.m.fieldOf("chance").forGetter($$0x -> $$0x.h), lt.bi.fieldOf("particle").forGetter($$0x -> $$0x.g), t()).apply($$0, dpc::new)
   );
   private final lr g;
   private final int h;

   @Override
   public MapCodec<dpc> a() {
      return f;
   }

   public dpc(int $$0, lr $$1, dwx.d $$2) {
      super($$2);
      this.h = $$0;
      this.g = $$1;
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(this.h) == 0) {
         ji $$4 = $$2.e();
         dwy $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jn.b)) {
            azd.a($$1, $$2, $$3, this.g);
         }
      }
   }
}
