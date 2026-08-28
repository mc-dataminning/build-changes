import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eub extends eus {
   public static final MapCodec<eub> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(efy.a.g.fieldOf("heightmap").orElse(efy.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eub::new)
   );
   private final efy.a b;
   private final int c;

   public eub(efy.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public euv.d a(diy $$0, iu $$1, iu $$2, euv.d $$3, euv.d $$4, eur $$5) {
      efy.a $$6;
      if ($$0 instanceof arq) {
         if (this.b == efy.a.a) {
            $$6 = efy.a.b;
         } else if (this.b == efy.a.c) {
            $$6 = efy.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iu $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new euv.d(new iu($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected euu<?> a() {
      return euu.g;
   }
}
