import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ers extends esj {
   public static final MapCodec<ers> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edq.a.g.fieldOf("heightmap").orElse(edq.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, ers::new)
   );
   private final edq.a b;
   private final int c;

   public ers(edq.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public esm.d a(dhl $$0, jh $$1, jh $$2, esm.d $$3, esm.d $$4, esi $$5) {
      edq.a $$6;
      if ($$0 instanceof ash) {
         if (this.b == edq.a.a) {
            $$6 = edq.a.b;
         } else if (this.b == edq.a.c) {
            $$6 = edq.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jh $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new esm.d(new jh($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected esl<?> a() {
      return esl.g;
   }
}
