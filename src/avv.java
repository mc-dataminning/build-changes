import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class avv {
   public static final Codec<avv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alb.a.fieldOf("sound_id").forGetter(avv::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(avv::b)).apply($$0, avv::a)
   );
   public static final Codec<ji<avv>> b = akx.a(lq.ag, a);
   public static final zj<ByteBuf, avv> c = zj.a(alb.b, avv::a, zh.i.a(zh::a), avv::b, avv::a);
   public static final zj<ww, ji<avv>> d = zh.a(lq.ag, c);
   private static final float e = 16.0F;
   private final alb f;
   private final float g;
   private final boolean h;

   private static avv a(alb $$0, Optional<Float> $$1) {
      return $$1.<avv>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static avv a(alb $$0) {
      return new avv($$0, 16.0F, false);
   }

   public static avv a(alb $$0, float $$1) {
      return new avv($$0, $$1, true);
   }

   private avv(alb $$0, float $$1, boolean $$2) {
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
