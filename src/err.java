import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class err extends esi {
   public static final MapCodec<err> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edo.a.g.fieldOf("heightmap").orElse(edo.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, err::new)
   );
   private final edo.a b;
   private final int c;

   public err(edo.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public esl.d a(dhc $$0, ji $$1, ji $$2, esl.d $$3, esl.d $$4, esh $$5) {
      edo.a $$6;
      if ($$0 instanceof ard) {
         if (this.b == edo.a.a) {
            $$6 = edo.a.b;
         } else if (this.b == edo.a.c) {
            $$6 = edo.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ji $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new esl.d(new ji($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected esk<?> a() {
      return esk.g;
   }
}
