import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class aqc {
   public static final Codec<aqc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(afw.a.fieldOf("sound_id").forGetter(aqc::a), Codec.FLOAT.optionalFieldOf("range").forGetter(aqc::b)).apply($$0, aqc::a)
   );
   public static final Codec<ib<aqc>> b = afs.a(jz.ae, a);
   private static final float c = 16.0F;
   private final afw d;
   private final float e;
   private final boolean f;

   private static aqc a(afw $$0, Optional<Float> $$1) {
      return $$1.<aqc>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static aqc a(afw $$0) {
      return new aqc($$0, 16.0F, false);
   }

   public static aqc a(afw $$0, float $$1) {
      return new aqc($$0, $$1, true);
   }

   private aqc(afw $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public afw a() {
      return this.d;
   }

   public float a(float $$0) {
      if (this.f) {
         return this.e;
      } else {
         return $$0 > 1.0F ? 16.0F * $$0 : 16.0F;
      }
   }

   private Optional<Float> b() {
      return this.f ? Optional.of(this.e) : Optional.empty();
   }

   public void a(tl $$0) {
      $$0.a(this.d);
      $$0.a(this.b(), tl::a);
   }

   public static aqc b(tl $$0) {
      afw $$1 = $$0.t();
      Optional<Float> $$2 = $$0.b(tl::readFloat);
      return a($$1, $$2);
   }
}
