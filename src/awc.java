import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class awc {
   public static final Codec<awc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alb.a.fieldOf("sound_id").forGetter(awc::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awc::b)).apply($$0, awc::a)
   );
   public static final Codec<jn<awc>> b = akx.a(lv.al, a);
   public static final zb<ByteBuf, awc> c = zb.a(alb.b, awc::a, yz.i.a(yz::a), awc::b, awc::a);
   public static final zb<wo, jn<awc>> d = yz.a(lv.al, c);
   private static final float e = 16.0F;
   private final alb f;
   private final float g;
   private final boolean h;

   private static awc a(alb $$0, Optional<Float> $$1) {
      return $$1.<awc>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awc a(alb $$0) {
      return new awc($$0, 16.0F, false);
   }

   public static awc a(alb $$0, float $$1) {
      return new awc($$0, $$1, true);
   }

   private awc(alb $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public alb a() {
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
