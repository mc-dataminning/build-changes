import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehn {
   public static final ehn a = new ehn(false, dlw.gV.m(), dlw.qp.m(), dlw.ew.m(), dlw.aX.m());
   public static final Codec<ehn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(ehn::a),
               dzo.a.optionalFieldOf("air_state", a.b()).forGetter(ehn::b),
               dzo.a.optionalFieldOf("water_state", a.b()).forGetter(ehn::c),
               dzo.a.optionalFieldOf("lava_state", a.b()).forGetter(ehn::d),
               dzo.a.optionalFieldOf("barrier_state", a.b()).forGetter(ehn::e)
            )
            .apply($$0, ehn::new)
   );
   private final boolean c;
   private final dzo d;
   private final dzo e;
   private final dzo f;
   private final dzo g;

   public static ehn a(boolean $$0, dzo $$1, dzo $$2, dzo $$3, dzo $$4) {
      return new ehn($$0, $$1, $$2, $$3, $$4);
   }

   public static ehn a(dzo $$0, dzo $$1, dzo $$2, dzo $$3) {
      return new ehn(false, $$0, $$1, $$2, $$3);
   }

   public static ehn a(boolean $$0, dzo $$1) {
      return new ehn($$0, $$1, a.c(), a.d(), a.e());
   }

   private ehn(boolean $$0, dzo $$1, dzo $$2, dzo $$3, dzo $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dzo b() {
      return this.d;
   }

   public dzo c() {
      return this.e;
   }

   public dzo d() {
      return this.f;
   }

   public dzo e() {
      return this.g;
   }
}
