import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eig {
   public static final eig a = new eig(false, dmh.gZ.m(), dmh.qt.m(), dmh.eA.m(), dmh.aX.m());
   public static final Codec<eig> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(eig::a),
               eah.a.optionalFieldOf("air_state", a.b()).forGetter(eig::b),
               eah.a.optionalFieldOf("water_state", a.b()).forGetter(eig::c),
               eah.a.optionalFieldOf("lava_state", a.b()).forGetter(eig::d),
               eah.a.optionalFieldOf("barrier_state", a.b()).forGetter(eig::e)
            )
            .apply($$0, eig::new)
   );
   private final boolean c;
   private final eah d;
   private final eah e;
   private final eah f;
   private final eah g;

   public static eig a(boolean $$0, eah $$1, eah $$2, eah $$3, eah $$4) {
      return new eig($$0, $$1, $$2, $$3, $$4);
   }

   public static eig a(eah $$0, eah $$1, eah $$2, eah $$3) {
      return new eig(false, $$0, $$1, $$2, $$3);
   }

   public static eig a(boolean $$0, eah $$1) {
      return new eig($$0, $$1, a.c(), a.d(), a.e());
   }

   private eig(boolean $$0, eah $$1, eah $$2, eah $$3, eah $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public eah b() {
      return this.d;
   }

   public eah c() {
      return this.e;
   }

   public eah d() {
      return this.f;
   }

   public eah e() {
      return this.g;
   }
}
