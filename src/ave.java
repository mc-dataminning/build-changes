import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ave {
   public static final Codec<ave> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akk.a.fieldOf("sound_id").forGetter(ave::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(ave::b)).apply($$0, ave::a)
   );
   public static final Codec<jj<ave>> b = akg.a(lr.ak, a);
   public static final ys<ByteBuf, ave> c = ys.a(akk.b, ave::a, yq.i.a(yq::a), ave::b, ave::a);
   public static final ys<wf, jj<ave>> d = yq.a(lr.ak, c);
   private static final float e = 16.0F;
   private final akk f;
   private final float g;
   private final boolean h;

   private static ave a(akk $$0, Optional<Float> $$1) {
      return $$1.<ave>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static ave a(akk $$0) {
      return new ave($$0, 16.0F, false);
   }

   public static ave a(akk $$0, float $$1) {
      return new ave($$0, $$1, true);
   }

   private ave(akk $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public akk a() {
      return this.f;
   }

   public float a(float $$0) {
      if (this.h) {
         return this.g;
      } else {
         return $$0 > 1.0F ? 16.0F * $$0 : 16.0F;
      }
   }

   private Optional<Float> b() {
      return this.h ? Optional.of(this.g) : Optional.empty();
   }
}
