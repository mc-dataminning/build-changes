import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class awk {
   public static final Codec<awk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ali.a.fieldOf("sound_id").forGetter(awk::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awk::b)).apply($$0, awk::a)
   );
   public static final Codec<jq<awk>> b = ale.a(lz.al, a);
   public static final zg<ByteBuf, awk> c = zg.a(ali.b, awk::a, ze.j.a(ze::a), awk::b, awk::a);
   public static final zg<wt, jq<awk>> d = ze.a(lz.al, c);
   private static final float e = 16.0F;
   private final ali f;
   private final float g;
   private final boolean h;

   private static awk a(ali $$0, Optional<Float> $$1) {
      return $$1.<awk>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awk a(ali $$0) {
      return new awk($$0, 16.0F, false);
   }

   public static awk a(ali $$0, float $$1) {
      return new awk($$0, $$1, true);
   }

   private awk(ali $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public ali a() {
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
