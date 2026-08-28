import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzu {
   public static final dzu a = new dzu(false, dfc.gz.o(), dfc.pL.o(), dfc.ej.o(), dfc.aQ.o());
   public static final Codec<dzu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dzu::a),
               dsd.b.optionalFieldOf("air_state", a.b()).forGetter(dzu::b),
               dsd.b.optionalFieldOf("water_state", a.b()).forGetter(dzu::c),
               dsd.b.optionalFieldOf("lava_state", a.b()).forGetter(dzu::d),
               dsd.b.optionalFieldOf("barrier_state", a.b()).forGetter(dzu::e)
            )
            .apply($$0, dzu::new)
   );
   private final boolean c;
   private final dsd d;
   private final dsd e;
   private final dsd f;
   private final dsd g;

   public static dzu a(boolean $$0, dsd $$1, dsd $$2, dsd $$3, dsd $$4) {
      return new dzu($$0, $$1, $$2, $$3, $$4);
   }

   public static dzu a(dsd $$0, dsd $$1, dsd $$2, dsd $$3) {
      return new dzu(false, $$0, $$1, $$2, $$3);
   }

   public static dzu a(boolean $$0, dsd $$1) {
      return new dzu($$0, $$1, a.c(), a.d(), a.e());
   }

   private dzu(boolean $$0, dsd $$1, dsd $$2, dsd $$3, dsd $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dsd b() {
      return this.d;
   }

   public dsd c() {
      return this.e;
   }

   public dsd d() {
      return this.f;
   }

   public dsd e() {
      return this.g;
   }
}
