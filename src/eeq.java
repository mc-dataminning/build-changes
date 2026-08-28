import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeq {
   public static final eeq a = new eeq(false, djm.gV.m(), djm.qn.m(), djm.ew.m(), djm.aX.m());
   public static final Codec<eeq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(eeq::a),
               dwv.a.optionalFieldOf("air_state", a.b()).forGetter(eeq::b),
               dwv.a.optionalFieldOf("water_state", a.b()).forGetter(eeq::c),
               dwv.a.optionalFieldOf("lava_state", a.b()).forGetter(eeq::d),
               dwv.a.optionalFieldOf("barrier_state", a.b()).forGetter(eeq::e)
            )
            .apply($$0, eeq::new)
   );
   private final boolean c;
   private final dwv d;
   private final dwv e;
   private final dwv f;
   private final dwv g;

   public static eeq a(boolean $$0, dwv $$1, dwv $$2, dwv $$3, dwv $$4) {
      return new eeq($$0, $$1, $$2, $$3, $$4);
   }

   public static eeq a(dwv $$0, dwv $$1, dwv $$2, dwv $$3) {
      return new eeq(false, $$0, $$1, $$2, $$3);
   }

   public static eeq a(boolean $$0, dwv $$1) {
      return new eeq($$0, $$1, a.c(), a.d(), a.e());
   }

   private eeq(boolean $$0, dwv $$1, dwv $$2, dwv $$3, dwv $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dwv b() {
      return this.d;
   }

   public dwv c() {
      return this.e;
   }

   public dwv d() {
      return this.f;
   }

   public dwv e() {
      return this.g;
   }
}
