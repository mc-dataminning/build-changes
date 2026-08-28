import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eet {
   public static final eet a = new eet(false, djp.gV.m(), djp.qn.m(), djp.ew.m(), djp.aX.m());
   public static final Codec<eet> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(eet::a),
               dwy.a.optionalFieldOf("air_state", a.b()).forGetter(eet::b),
               dwy.a.optionalFieldOf("water_state", a.b()).forGetter(eet::c),
               dwy.a.optionalFieldOf("lava_state", a.b()).forGetter(eet::d),
               dwy.a.optionalFieldOf("barrier_state", a.b()).forGetter(eet::e)
            )
            .apply($$0, eet::new)
   );
   private final boolean c;
   private final dwy d;
   private final dwy e;
   private final dwy f;
   private final dwy g;

   public static eet a(boolean $$0, dwy $$1, dwy $$2, dwy $$3, dwy $$4) {
      return new eet($$0, $$1, $$2, $$3, $$4);
   }

   public static eet a(dwy $$0, dwy $$1, dwy $$2, dwy $$3) {
      return new eet(false, $$0, $$1, $$2, $$3);
   }

   public static eet a(boolean $$0, dwy $$1) {
      return new eet($$0, $$1, a.c(), a.d(), a.e());
   }

   private eet(boolean $$0, dwy $$1, dwy $$2, dwy $$3, dwy $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dwy b() {
      return this.d;
   }

   public dwy c() {
      return this.e;
   }

   public dwy d() {
      return this.f;
   }

   public dwy e() {
      return this.g;
   }
}
