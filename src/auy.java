import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class auy {
   public static final Codec<auy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akf.a.fieldOf("sound_id").forGetter(auy::a), Codec.FLOAT.optionalFieldOf("range").forGetter(auy::b)).apply($$0, auy::a)
   );
   public static final Codec<iv<auy>> b = akb.a(ld.ag, a);
   public static final yq<ByteBuf, auy> c = yq.a(akf.b, auy::a, yo.h.a(yo::a), auy::b, auy::a);
   public static final yq<wd, iv<auy>> d = yo.a(ld.ag, c);
   private static final float e = 16.0F;
   private final akf f;
   private final float g;
   private final boolean h;

   private static auy a(akf $$0, Optional<Float> $$1) {
      return $$1.<auy>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static auy a(akf $$0) {
      return new auy($$0, 16.0F, false);
   }

   public static auy a(akf $$0, float $$1) {
      return new auy($$0, $$1, true);
   }

   private auy(akf $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public akf a() {
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
