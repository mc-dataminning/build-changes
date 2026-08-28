import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ein {
   public static final ein a = new ein(false, dmo.gZ.m(), dmo.qt.m(), dmo.eA.m(), dmo.aX.m());
   public static final Codec<ein> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(ein::a),
               eao.a.optionalFieldOf("air_state", a.b()).forGetter(ein::b),
               eao.a.optionalFieldOf("water_state", a.b()).forGetter(ein::c),
               eao.a.optionalFieldOf("lava_state", a.b()).forGetter(ein::d),
               eao.a.optionalFieldOf("barrier_state", a.b()).forGetter(ein::e)
            )
            .apply($$0, ein::new)
   );
   private final boolean c;
   private final eao d;
   private final eao e;
   private final eao f;
   private final eao g;

   public static ein a(boolean $$0, eao $$1, eao $$2, eao $$3, eao $$4) {
      return new ein($$0, $$1, $$2, $$3, $$4);
   }

   public static ein a(eao $$0, eao $$1, eao $$2, eao $$3) {
      return new ein(false, $$0, $$1, $$2, $$3);
   }

   public static ein a(boolean $$0, eao $$1) {
      return new ein($$0, $$1, a.c(), a.d(), a.e());
   }

   private ein(boolean $$0, eao $$1, eao $$2, eao $$3, eao $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public eao b() {
      return this.d;
   }

   public eao c() {
      return this.e;
   }

   public eao d() {
      return this.f;
   }

   public eao e() {
      return this.g;
   }
}
