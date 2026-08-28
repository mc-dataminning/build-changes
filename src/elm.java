import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class elm extends emc {
   public static final MapCodec<elm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxp.a.g.fieldOf("heightmap").orElse(dxp.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, elm::new)
   );
   private final dxp.a b;
   private final int c;

   public elm(dxp.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public emf.c a(dbw $$0, iz $$1, iz $$2, emf.c $$3, emf.c $$4, emb $$5) {
      dxp.a $$6;
      if ($$0 instanceof arb) {
         if (this.b == dxp.a.a) {
            $$6 = dxp.a.b;
         } else if (this.b == dxp.a.c) {
            $$6 = dxp.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iz $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new emf.c(new iz($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected eme<?> a() {
      return eme.g;
   }
}
