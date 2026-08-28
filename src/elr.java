import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class elr extends emh {
   public static final MapCodec<elr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxu.a.g.fieldOf("heightmap").orElse(dxu.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, elr::new)
   );
   private final dxu.a b;
   private final int c;

   public elr(dxu.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public emk.c a(dcb $$0, iz $$1, iz $$2, emk.c $$3, emk.c $$4, emg $$5) {
      dxu.a $$6;
      if ($$0 instanceof arf) {
         if (this.b == dxu.a.a) {
            $$6 = dxu.a.b;
         } else if (this.b == dxu.a.c) {
            $$6 = dxu.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iz $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new emk.c(new iz($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected emj<?> a() {
      return emj.g;
   }
}
