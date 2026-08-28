import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpa extends dnx {
   public static final MapCodec<dpa> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.m.fieldOf("chance").forGetter($$0x -> $$0x.h), lt.bi.fieldOf("particle").forGetter($$0x -> $$0x.g), t()).apply($$0, dpa::new)
   );
   private final lr g;
   private final int h;

   @Override
   public MapCodec<dpa> a() {
      return f;
   }

   public dpa(int $$0, lr $$1, dwv.d $$2) {
      super($$2);
      this.h = $$0;
      this.g = $$1;
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(this.h) == 0) {
         ji $$4 = $$2.e();
         dww $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jn.b)) {
            azd.a($$1, $$2, $$3, this.g);
         }
      }
   }
}
