import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eis {
   public static final eis a = new eis(false, dmt.gZ.m(), dmt.qt.m(), dmt.eA.m(), dmt.aX.m());
   public static final Codec<eis> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(eis::a),
               eat.a.optionalFieldOf("air_state", a.b()).forGetter(eis::b),
               eat.a.optionalFieldOf("water_state", a.b()).forGetter(eis::c),
               eat.a.optionalFieldOf("lava_state", a.b()).forGetter(eis::d),
               eat.a.optionalFieldOf("barrier_state", a.b()).forGetter(eis::e)
            )
            .apply($$0, eis::new)
   );
   private final boolean c;
   private final eat d;
   private final eat e;
   private final eat f;
   private final eat g;

   public static eis a(boolean $$0, eat $$1, eat $$2, eat $$3, eat $$4) {
      return new eis($$0, $$1, $$2, $$3, $$4);
   }

   public static eis a(eat $$0, eat $$1, eat $$2, eat $$3) {
      return new eis(false, $$0, $$1, $$2, $$3);
   }

   public static eis a(boolean $$0, eat $$1) {
      return new eis($$0, $$1, a.c(), a.d(), a.e());
   }

   private eis(boolean $$0, eat $$1, eat $$2, eat $$3, eat $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public eat b() {
      return this.d;
   }

   public eat c() {
      return this.e;
   }

   public eat d() {
      return this.f;
   }

   public eat e() {
      return this.g;
   }
}
