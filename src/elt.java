import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class elt extends emj {
   public static final MapCodec<elt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxw.a.g.fieldOf("heightmap").orElse(dxw.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, elt::new)
   );
   private final dxw.a b;
   private final int c;

   public elt(dxw.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public emm.c a(dcd $$0, iz $$1, iz $$2, emm.c $$3, emm.c $$4, emi $$5) {
      dxw.a $$6;
      if ($$0 instanceof arf) {
         if (this.b == dxw.a.a) {
            $$6 = dxw.a.b;
         } else if (this.b == dxw.a.c) {
            $$6 = dxw.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iz $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new emm.c(new iz($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected eml<?> a() {
      return eml.g;
   }
}
