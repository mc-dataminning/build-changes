import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efq {
   public static final efq a = new efq(false, dko.gO.m(), dko.qg.m(), dko.ew.m(), dko.aX.m());
   public static final Codec<efq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(efq::a),
               dxv.a.optionalFieldOf("air_state", a.b()).forGetter(efq::b),
               dxv.a.optionalFieldOf("water_state", a.b()).forGetter(efq::c),
               dxv.a.optionalFieldOf("lava_state", a.b()).forGetter(efq::d),
               dxv.a.optionalFieldOf("barrier_state", a.b()).forGetter(efq::e)
            )
            .apply($$0, efq::new)
   );
   private final boolean c;
   private final dxv d;
   private final dxv e;
   private final dxv f;
   private final dxv g;

   public static efq a(boolean $$0, dxv $$1, dxv $$2, dxv $$3, dxv $$4) {
      return new efq($$0, $$1, $$2, $$3, $$4);
   }

   public static efq a(dxv $$0, dxv $$1, dxv $$2, dxv $$3) {
      return new efq(false, $$0, $$1, $$2, $$3);
   }

   public static efq a(boolean $$0, dxv $$1) {
      return new efq($$0, $$1, a.c(), a.d(), a.e());
   }

   private efq(boolean $$0, dxv $$1, dxv $$2, dxv $$3, dxv $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dxv b() {
      return this.d;
   }

   public dxv c() {
      return this.e;
   }

   public dxv d() {
      return this.f;
   }

   public dxv e() {
      return this.g;
   }
}
