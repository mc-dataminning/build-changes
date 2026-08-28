import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class elp extends emf {
   public static final MapCodec<elp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxs.a.g.fieldOf("heightmap").orElse(dxs.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, elp::new)
   );
   private final dxs.a b;
   private final int c;

   public elp(dxs.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public emi.c a(dbz $$0, iz $$1, iz $$2, emi.c $$3, emi.c $$4, eme $$5) {
      dxs.a $$6;
      if ($$0 instanceof are) {
         if (this.b == dxs.a.a) {
            $$6 = dxs.a.b;
         } else if (this.b == dxs.a.c) {
            $$6 = dxs.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iz $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new emi.c(new iz($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected emh<?> a() {
      return emh.g;
   }
}
