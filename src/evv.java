import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class evv extends ewm {
   public static final MapCodec<evv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehp.a.g.fieldOf("heightmap").orElse(ehp.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, evv::new)
   );
   private final ehp.a b;
   private final int c;

   public evv(ehp.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ewp.d a(dkm $$0, iw $$1, iw $$2, ewp.d $$3, ewp.d $$4, ewl $$5) {
      ehp.a $$6;
      if ($$0 instanceof asb) {
         if (this.b == ehp.a.a) {
            $$6 = ehp.a.b;
         } else if (this.b == ehp.a.c) {
            $$6 = ehp.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iw $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ewp.d(new iw($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ewo<?> a() {
      return ewo.g;
   }
}
