import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class avg {
   public static final Codec<avg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akk.a.fieldOf("sound_id").forGetter(avg::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(avg::b)).apply($$0, avg::a)
   );
   public static final Codec<jj<avg>> b = akg.a(lr.ak, a);
   public static final ys<ByteBuf, avg> c = ys.a(akk.b, avg::a, yq.i.a(yq::a), avg::b, avg::a);
   public static final ys<wf, jj<avg>> d = yq.a(lr.ak, c);
   private static final float e = 16.0F;
   private final akk f;
   private final float g;
   private final boolean h;

   private static avg a(akk $$0, Optional<Float> $$1) {
      return $$1.<avg>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static avg a(akk $$0) {
      return new avg($$0, 16.0F, false);
   }

   public static avg a(akk $$0, float $$1) {
      return new avg($$0, $$1, true);
   }

   private avg(akk $$0, float $$1, boolean $$2) {
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
