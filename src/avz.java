import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class avz {
   public static final Codec<avz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alf.a.fieldOf("sound_id").forGetter(avz::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(avz::b)).apply($$0, avz::a)
   );
   public static final Codec<ji<avz>> b = alb.a(lq.ag, a);
   public static final zn<ByteBuf, avz> c = zn.a(alf.b, avz::a, zl.i.a(zl::a), avz::b, avz::a);
   public static final zn<xa, ji<avz>> d = zl.a(lq.ag, c);
   private static final float e = 16.0F;
   private final alf f;
   private final float g;
   private final boolean h;

   private static avz a(alf $$0, Optional<Float> $$1) {
      return $$1.<avz>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static avz a(alf $$0) {
      return new avz($$0, 16.0F, false);
   }

   public static avz a(alf $$0, float $$1) {
      return new avz($$0, $$1, true);
   }

   private avz(alf $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public alf a() {
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
