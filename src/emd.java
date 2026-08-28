import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emd extends emt {
   public static final MapCodec<emd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyf.a.g.fieldOf("heightmap").orElse(dyf.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, emd::new)
   );
   private final dyf.a b;
   private final int c;

   public emd(dyf.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public emw.c a(dci $$0, ja $$1, ja $$2, emw.c $$3, emw.c $$4, ems $$5) {
      dyf.a $$6;
      if ($$0 instanceof aqm) {
         if (this.b == dyf.a.a) {
            $$6 = dyf.a.b;
         } else if (this.b == dyf.a.c) {
            $$6 = dyf.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ja $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new emw.c(new ja($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected emv<?> a() {
      return emv.g;
   }
}
