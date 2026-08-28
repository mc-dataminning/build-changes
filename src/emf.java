import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emf extends emv {
   public static final MapCodec<emf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyg.a.g.fieldOf("heightmap").orElse(dyg.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, emf::new)
   );
   private final dyg.a b;
   private final int c;

   public emf(dyg.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public emy.c a(dcj $$0, ja $$1, ja $$2, emy.c $$3, emy.c $$4, emu $$5) {
      dyg.a $$6;
      if ($$0 instanceof aqm) {
         if (this.b == dyg.a.a) {
            $$6 = dyg.a.b;
         } else if (this.b == dyg.a.c) {
            $$6 = dyg.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ja $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new emy.c(new ja($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected emx<?> a() {
      return emx.g;
   }
}
