import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efj {
   public static final efj a = new efj(false, dkf.gV.m(), dkf.qn.m(), dkf.ew.m(), dkf.aX.m());
   public static final Codec<efj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(efj::a),
               dxo.a.optionalFieldOf("air_state", a.b()).forGetter(efj::b),
               dxo.a.optionalFieldOf("water_state", a.b()).forGetter(efj::c),
               dxo.a.optionalFieldOf("lava_state", a.b()).forGetter(efj::d),
               dxo.a.optionalFieldOf("barrier_state", a.b()).forGetter(efj::e)
            )
            .apply($$0, efj::new)
   );
   private final boolean c;
   private final dxo d;
   private final dxo e;
   private final dxo f;
   private final dxo g;

   public static efj a(boolean $$0, dxo $$1, dxo $$2, dxo $$3, dxo $$4) {
      return new efj($$0, $$1, $$2, $$3, $$4);
   }

   public static efj a(dxo $$0, dxo $$1, dxo $$2, dxo $$3) {
      return new efj(false, $$0, $$1, $$2, $$3);
   }

   public static efj a(boolean $$0, dxo $$1) {
      return new efj($$0, $$1, a.c(), a.d(), a.e());
   }

   private efj(boolean $$0, dxo $$1, dxo $$2, dxo $$3, dxo $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dxo b() {
      return this.d;
   }

   public dxo c() {
      return this.e;
   }

   public dxo d() {
      return this.f;
   }

   public dxo e() {
      return this.g;
   }
}
