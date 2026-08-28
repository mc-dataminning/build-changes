import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edf {
   public static final edf a = new edf(false, dig.gz.m(), dig.pL.m(), dig.ej.m(), dig.aQ.m());
   public static final Codec<edf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(edf::a),
               dvj.a.optionalFieldOf("air_state", a.b()).forGetter(edf::b),
               dvj.a.optionalFieldOf("water_state", a.b()).forGetter(edf::c),
               dvj.a.optionalFieldOf("lava_state", a.b()).forGetter(edf::d),
               dvj.a.optionalFieldOf("barrier_state", a.b()).forGetter(edf::e)
            )
            .apply($$0, edf::new)
   );
   private final boolean c;
   private final dvj d;
   private final dvj e;
   private final dvj f;
   private final dvj g;

   public static edf a(boolean $$0, dvj $$1, dvj $$2, dvj $$3, dvj $$4) {
      return new edf($$0, $$1, $$2, $$3, $$4);
   }

   public static edf a(dvj $$0, dvj $$1, dvj $$2, dvj $$3) {
      return new edf(false, $$0, $$1, $$2, $$3);
   }

   public static edf a(boolean $$0, dvj $$1) {
      return new edf($$0, $$1, a.c(), a.d(), a.e());
   }

   private edf(boolean $$0, dvj $$1, dvj $$2, dvj $$3, dvj $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dvj b() {
      return this.d;
   }

   public dvj c() {
      return this.e;
   }

   public dvj d() {
      return this.f;
   }

   public dvj e() {
      return this.g;
   }
}
