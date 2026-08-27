import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ato {
   public static final Codec<ato> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajc.a.fieldOf("sound_id").forGetter(ato::a), Codec.FLOAT.optionalFieldOf("range").forGetter(ato::b)).apply($$0, ato::a)
   );
   public static final Codec<il<ato>> b = aiy.a(ki.af, a);
   public static final xq<ByteBuf, ato> c = xq.a(ajc.b, ato::a, xo.f.a(xo::a), ato::b, ato::a);
   public static final xq<vd, il<ato>> d = xo.a(ki.af, c);
   private static final float e = 16.0F;
   private final ajc f;
   private final float g;
   private final boolean h;

   private static ato a(ajc $$0, Optional<Float> $$1) {
      return $$1.<ato>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static ato a(ajc $$0) {
      return new ato($$0, 16.0F, false);
   }

   public static ato a(ajc $$0, float $$1) {
      return new ato($$0, $$1, true);
   }

   private ato(ajc $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public ajc a() {
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
