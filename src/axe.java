import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class axe {
   public static final Codec<axe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alz.a.fieldOf("sound_id").forGetter(axe::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(axe::b)).apply($$0, axe::a)
   );
   public static final Codec<jq<axe>> b = alv.a(mb.al, a);
   public static final zt<ByteBuf, axe> c = zt.a(alz.b, axe::a, zr.l.a(zr::a), axe::b, axe::a);
   public static final zt<xg, jq<axe>> d = zr.a(mb.al, c);
   private static final float e = 16.0F;
   private final alz f;
   private final float g;
   private final boolean h;

   private static axe a(alz $$0, Optional<Float> $$1) {
      return $$1.<axe>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static axe a(alz $$0) {
      return new axe($$0, 16.0F, false);
   }

   public static axe a(alz $$0, float $$1) {
      return new axe($$0, $$1, true);
   }

   private axe(alz $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public alz a() {
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
