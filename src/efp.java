import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efp {
   public static final efp a = new efp(false, dkn.gO.m(), dkn.qg.m(), dkn.ew.m(), dkn.aX.m());
   public static final Codec<efp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(efp::a),
               dxu.a.optionalFieldOf("air_state", a.b()).forGetter(efp::b),
               dxu.a.optionalFieldOf("water_state", a.b()).forGetter(efp::c),
               dxu.a.optionalFieldOf("lava_state", a.b()).forGetter(efp::d),
               dxu.a.optionalFieldOf("barrier_state", a.b()).forGetter(efp::e)
            )
            .apply($$0, efp::new)
   );
   private final boolean c;
   private final dxu d;
   private final dxu e;
   private final dxu f;
   private final dxu g;

   public static efp a(boolean $$0, dxu $$1, dxu $$2, dxu $$3, dxu $$4) {
      return new efp($$0, $$1, $$2, $$3, $$4);
   }

   public static efp a(dxu $$0, dxu $$1, dxu $$2, dxu $$3) {
      return new efp(false, $$0, $$1, $$2, $$3);
   }

   public static efp a(boolean $$0, dxu $$1) {
      return new efp($$0, $$1, a.c(), a.d(), a.e());
   }

   private efp(boolean $$0, dxu $$1, dxu $$2, dxu $$3, dxu $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dxu b() {
      return this.d;
   }

   public dxu c() {
      return this.e;
   }

   public dxu d() {
      return this.f;
   }

   public dxu e() {
      return this.g;
   }
}
