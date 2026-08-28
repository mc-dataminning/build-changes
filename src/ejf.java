import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejf {
   public static final ejf a = new ejf(false, dng.gZ.m(), dng.qt.m(), dng.eA.m(), dng.aX.m());
   public static final Codec<ejf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(ejf::a),
               ebg.a.optionalFieldOf("air_state", a.b()).forGetter(ejf::b),
               ebg.a.optionalFieldOf("water_state", a.b()).forGetter(ejf::c),
               ebg.a.optionalFieldOf("lava_state", a.b()).forGetter(ejf::d),
               ebg.a.optionalFieldOf("barrier_state", a.b()).forGetter(ejf::e)
            )
            .apply($$0, ejf::new)
   );
   private final boolean c;
   private final ebg d;
   private final ebg e;
   private final ebg f;
   private final ebg g;

   public static ejf a(boolean $$0, ebg $$1, ebg $$2, ebg $$3, ebg $$4) {
      return new ejf($$0, $$1, $$2, $$3, $$4);
   }

   public static ejf a(ebg $$0, ebg $$1, ebg $$2, ebg $$3) {
      return new ejf(false, $$0, $$1, $$2, $$3);
   }

   public static ejf a(boolean $$0, ebg $$1) {
      return new ejf($$0, $$1, a.c(), a.d(), a.e());
   }

   private ejf(boolean $$0, ebg $$1, ebg $$2, ebg $$3, ebg $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public ebg b() {
      return this.d;
   }

   public ebg c() {
      return this.e;
   }

   public ebg d() {
      return this.f;
   }

   public ebg e() {
      return this.g;
   }
}
