import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class aun {
   public static final Codec<aun> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajv.a.fieldOf("sound_id").forGetter(aun::a), Codec.FLOAT.optionalFieldOf("range").forGetter(aun::b)).apply($$0, aun::a)
   );
   public static final Codec<in<aun>> b = ajr.a(ku.ag, a);
   public static final yg<ByteBuf, aun> c = yg.a(ajv.b, aun::a, ye.h.a(ye::a), aun::b, aun::a);
   public static final yg<vt, in<aun>> d = ye.a(ku.ag, c);
   private static final float e = 16.0F;
   private final ajv f;
   private final float g;
   private final boolean h;

   private static aun a(ajv $$0, Optional<Float> $$1) {
      return $$1.<aun>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static aun a(ajv $$0) {
      return new aun($$0, 16.0F, false);
   }

   public static aun a(ajv $$0, float $$1) {
      return new aun($$0, $$1, true);
   }

   private aun(ajv $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public ajv a() {
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
