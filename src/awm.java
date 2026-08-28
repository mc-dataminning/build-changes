import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class awm {
   public static final Codec<awm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alj.a.fieldOf("sound_id").forGetter(awm::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awm::b)).apply($$0, awm::a)
   );
   public static final Codec<jq<awm>> b = alf.a(ma.al, a);
   public static final zh<ByteBuf, awm> c = zh.a(alj.b, awm::a, zf.k.a(zf::a), awm::b, awm::a);
   public static final zh<wu, jq<awm>> d = zf.a(ma.al, c);
   private static final float e = 16.0F;
   private final alj f;
   private final float g;
   private final boolean h;

   private static awm a(alj $$0, Optional<Float> $$1) {
      return $$1.<awm>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awm a(alj $$0) {
      return new awm($$0, 16.0F, false);
   }

   public static awm a(alj $$0, float $$1) {
      return new awm($$0, $$1, true);
   }

   private awm(alj $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public alj a() {
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
