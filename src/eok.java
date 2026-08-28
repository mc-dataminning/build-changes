import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eok extends epb {
   public static final MapCodec<eok> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eak.a.g.fieldOf("heightmap").orElse(eak.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eok::new)
   );
   private final eak.a b;
   private final int c;

   public eok(eak.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public epe.c a(dej $$0, je $$1, je $$2, epe.c $$3, epe.c $$4, epa $$5) {
      eak.a $$6;
      if ($$0 instanceof arh) {
         if (this.b == eak.a.a) {
            $$6 = eak.a.b;
         } else if (this.b == eak.a.c) {
            $$6 = eak.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      je $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new epe.c(new je($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected epd<?> a() {
      return epd.g;
   }
}
