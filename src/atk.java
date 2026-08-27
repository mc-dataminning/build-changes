import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class atk {
   public static final Codec<atk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aiy.a.fieldOf("sound_id").forGetter(atk::a), Codec.FLOAT.optionalFieldOf("range").forGetter(atk::b)).apply($$0, atk::a)
   );
   public static final Codec<ij<atk>> b = aiu.a(kg.af, a);
   public static final xo<ByteBuf, atk> c = xo.a(aiy.b, atk::a, xm.f.a(xm::a), atk::b, atk::a);
   public static final xo<vb, ij<atk>> d = xm.a(kg.af, c);
   private static final float e = 16.0F;
   private final aiy f;
   private final float g;
   private final boolean h;

   private static atk a(aiy $$0, Optional<Float> $$1) {
      return $$1.<atk>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static atk a(aiy $$0) {
      return new atk($$0, 16.0F, false);
   }

   public static atk a(aiy $$0, float $$1) {
      return new atk($$0, $$1, true);
   }

   private atk(aiy $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public aiy a() {
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
