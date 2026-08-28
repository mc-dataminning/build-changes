import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class err extends esi {
   public static final MapCodec<err> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edp.a.g.fieldOf("heightmap").orElse(edp.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, err::new)
   );
   private final edp.a b;
   private final int c;

   public err(edp.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public esl.d a(dhk $$0, jh $$1, jh $$2, esl.d $$3, esl.d $$4, esh $$5) {
      edp.a $$6;
      if ($$0 instanceof ash) {
         if (this.b == edp.a.a) {
            $$6 = edp.a.b;
         } else if (this.b == edp.a.c) {
            $$6 = edp.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jh $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new esl.d(new jh($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected esk<?> a() {
      return esk.g;
   }
}
