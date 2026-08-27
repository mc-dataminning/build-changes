import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dov {
   public static final dov a = new dov(false, cvh.gz.o(), cvh.pL.o(), cvh.ej.o(), cvh.aQ.o());
   public static final Codec<dov> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dov::a),
               dhn.b.optionalFieldOf("air_state", a.b()).forGetter(dov::b),
               dhn.b.optionalFieldOf("water_state", a.b()).forGetter(dov::c),
               dhn.b.optionalFieldOf("lava_state", a.b()).forGetter(dov::d),
               dhn.b.optionalFieldOf("barrier_state", a.b()).forGetter(dov::e)
            )
            .apply($$0, dov::new)
   );
   private final boolean c;
   private final dhn d;
   private final dhn e;
   private final dhn f;
   private final dhn g;

   public static dov a(boolean $$0, dhn $$1, dhn $$2, dhn $$3, dhn $$4) {
      return new dov($$0, $$1, $$2, $$3, $$4);
   }

   public static dov a(dhn $$0, dhn $$1, dhn $$2, dhn $$3) {
      return new dov(false, $$0, $$1, $$2, $$3);
   }

   public static dov a(boolean $$0, dhn $$1) {
      return new dov($$0, $$1, a.c(), a.d(), a.e());
   }

   private dov(boolean $$0, dhn $$1, dhn $$2, dhn $$3, dhn $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dhn b() {
      return this.d;
   }

   public dhn c() {
      return this.e;
   }

   public dhn d() {
      return this.f;
   }

   public dhn e() {
      return this.g;
   }
}
