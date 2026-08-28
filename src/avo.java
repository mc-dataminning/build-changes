import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class avo {
   public static final Codec<avo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akr.a.fieldOf("sound_id").forGetter(avo::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(avo::b)).apply($$0, avo::a)
   );
   public static final Codec<jm<avo>> b = akn.a(lu.al, a);
   public static final yx<ByteBuf, avo> c = yx.a(akr.b, avo::a, yv.i.a(yv::a), avo::b, avo::a);
   public static final yx<wk, jm<avo>> d = yv.a(lu.al, c);
   private static final float e = 16.0F;
   private final akr f;
   private final float g;
   private final boolean h;

   private static avo a(akr $$0, Optional<Float> $$1) {
      return $$1.<avo>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static avo a(akr $$0) {
      return new avo($$0, 16.0F, false);
   }

   public static avo a(akr $$0, float $$1) {
      return new avo($$0, $$1, true);
   }

   private avo(akr $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public akr a() {
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
