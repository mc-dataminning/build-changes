import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class awf {
   public static final Codec<awf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ale.a.fieldOf("sound_id").forGetter(awf::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awf::b)).apply($$0, awf::a)
   );
   public static final Codec<jo<awf>> b = ala.a(lw.al, a);
   public static final zc<ByteBuf, awf> c = zc.a(ale.b, awf::a, za.j.a(za::a), awf::b, awf::a);
   public static final zc<wp, jo<awf>> d = za.a(lw.al, c);
   private static final float e = 16.0F;
   private final ale f;
   private final float g;
   private final boolean h;

   private static awf a(ale $$0, Optional<Float> $$1) {
      return $$1.<awf>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awf a(ale $$0) {
      return new awf($$0, 16.0F, false);
   }

   public static awf a(ale $$0, float $$1) {
      return new awf($$0, $$1, true);
   }

   private awf(ale $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public ale a() {
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
