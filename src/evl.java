import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class evl extends ewc {
   public static final MapCodec<evl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehf.a.g.fieldOf("heightmap").orElse(ehf.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, evl::new)
   );
   private final ehf.a b;
   private final int c;

   public evl(ehf.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ewf.d a(dkc $$0, iw $$1, iw $$2, ewf.d $$3, ewf.d $$4, ewb $$5) {
      ehf.a $$6;
      if ($$0 instanceof aru) {
         if (this.b == ehf.a.a) {
            $$6 = ehf.a.b;
         } else if (this.b == ehf.a.c) {
            $$6 = ehf.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iw $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ewf.d(new iw($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ewe<?> a() {
      return ewe.g;
   }
}
