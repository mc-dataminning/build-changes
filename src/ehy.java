import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehy {
   public static final ehy a = new ehy(false, dmc.gW.m(), dmc.qq.m(), dmc.ex.m(), dmc.aX.m());
   public static final Codec<ehy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(ehy::a),
               dzz.a.optionalFieldOf("air_state", a.b()).forGetter(ehy::b),
               dzz.a.optionalFieldOf("water_state", a.b()).forGetter(ehy::c),
               dzz.a.optionalFieldOf("lava_state", a.b()).forGetter(ehy::d),
               dzz.a.optionalFieldOf("barrier_state", a.b()).forGetter(ehy::e)
            )
            .apply($$0, ehy::new)
   );
   private final boolean c;
   private final dzz d;
   private final dzz e;
   private final dzz f;
   private final dzz g;

   public static ehy a(boolean $$0, dzz $$1, dzz $$2, dzz $$3, dzz $$4) {
      return new ehy($$0, $$1, $$2, $$3, $$4);
   }

   public static ehy a(dzz $$0, dzz $$1, dzz $$2, dzz $$3) {
      return new ehy(false, $$0, $$1, $$2, $$3);
   }

   public static ehy a(boolean $$0, dzz $$1) {
      return new ehy($$0, $$1, a.c(), a.d(), a.e());
   }

   private ehy(boolean $$0, dzz $$1, dzz $$2, dzz $$3, dzz $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dzz b() {
      return this.d;
   }

   public dzz c() {
      return this.e;
   }

   public dzz d() {
      return this.f;
   }

   public dzz e() {
      return this.g;
   }
}
