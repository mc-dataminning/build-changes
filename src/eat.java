import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eat {
   public static final eat a = new eat(false, dfe.ht.n(), dfe.qW.n(), dfe.fb.n(), dfe.by.n());
   public static final Codec<eat> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(eat::a),
               dtc.b.optionalFieldOf("air_state", a.b()).forGetter(eat::b),
               dtc.b.optionalFieldOf("water_state", a.b()).forGetter(eat::c),
               dtc.b.optionalFieldOf("lava_state", a.b()).forGetter(eat::d),
               dtc.b.optionalFieldOf("barrier_state", a.b()).forGetter(eat::e)
            )
            .apply($$0, eat::new)
   );
   private final boolean c;
   private final dtc d;
   private final dtc e;
   private final dtc f;
   private final dtc g;

   public static eat a(boolean $$0, dtc $$1, dtc $$2, dtc $$3, dtc $$4) {
      return new eat($$0, $$1, $$2, $$3, $$4);
   }

   public static eat a(dtc $$0, dtc $$1, dtc $$2, dtc $$3) {
      return new eat(false, $$0, $$1, $$2, $$3);
   }

   public static eat a(boolean $$0, dtc $$1) {
      return new eat($$0, $$1, a.c(), a.d(), a.e());
   }

   private eat(boolean $$0, dtc $$1, dtc $$2, dtc $$3, dtc $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dtc b() {
      return this.d;
   }

   public dtc c() {
      return this.e;
   }

   public dtc d() {
      return this.f;
   }

   public dtc e() {
      return this.g;
   }
}
