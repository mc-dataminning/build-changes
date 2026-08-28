import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efo {
   public static final efo a = new efo(false, dkg.gV.m(), dkg.qn.m(), dkg.ew.m(), dkg.aX.m());
   public static final Codec<efo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(efo::a),
               dxq.a.optionalFieldOf("air_state", a.b()).forGetter(efo::b),
               dxq.a.optionalFieldOf("water_state", a.b()).forGetter(efo::c),
               dxq.a.optionalFieldOf("lava_state", a.b()).forGetter(efo::d),
               dxq.a.optionalFieldOf("barrier_state", a.b()).forGetter(efo::e)
            )
            .apply($$0, efo::new)
   );
   private final boolean c;
   private final dxq d;
   private final dxq e;
   private final dxq f;
   private final dxq g;

   public static efo a(boolean $$0, dxq $$1, dxq $$2, dxq $$3, dxq $$4) {
      return new efo($$0, $$1, $$2, $$3, $$4);
   }

   public static efo a(dxq $$0, dxq $$1, dxq $$2, dxq $$3) {
      return new efo(false, $$0, $$1, $$2, $$3);
   }

   public static efo a(boolean $$0, dxq $$1) {
      return new efo($$0, $$1, a.c(), a.d(), a.e());
   }

   private efo(boolean $$0, dxq $$1, dxq $$2, dxq $$3, dxq $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dxq b() {
      return this.d;
   }

   public dxq c() {
      return this.e;
   }

   public dxq d() {
      return this.f;
   }

   public dxq e() {
      return this.g;
   }
}
