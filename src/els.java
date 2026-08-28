import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class els extends emi {
   public static final MapCodec<els> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxv.a.g.fieldOf("heightmap").orElse(dxv.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, els::new)
   );
   private final dxv.a b;
   private final int c;

   public els(dxv.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public eml.c a(dcc $$0, iz $$1, iz $$2, eml.c $$3, eml.c $$4, emh $$5) {
      dxv.a $$6;
      if ($$0 instanceof arf) {
         if (this.b == dxv.a.a) {
            $$6 = dxv.a.b;
         } else if (this.b == dxv.a.c) {
            $$6 = dxv.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iz $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new eml.c(new iz($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected emk<?> a() {
      return emk.g;
   }
}
