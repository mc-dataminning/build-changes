import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class awd {
   public static final Codec<awd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alc.a.fieldOf("sound_id").forGetter(awd::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awd::b)).apply($$0, awd::a)
   );
   public static final Codec<jn<awd>> b = aky.a(lv.al, a);
   public static final zb<ByteBuf, awd> c = zb.a(alc.b, awd::a, yz.i.a(yz::a), awd::b, awd::a);
   public static final zb<wo, jn<awd>> d = yz.a(lv.al, c);
   private static final float e = 16.0F;
   private final alc f;
   private final float g;
   private final boolean h;

   private static awd a(alc $$0, Optional<Float> $$1) {
      return $$1.<awd>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awd a(alc $$0) {
      return new awd($$0, 16.0F, false);
   }

   public static awd a(alc $$0, float $$1) {
      return new awd($$0, $$1, true);
   }

   private awd(alc $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public alc a() {
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
