import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dml {
   public static final dml a = new dml(false, cte.gz.o(), cte.pL.o(), cte.ej.o(), cte.aQ.o());
   public static final Codec<dml> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dml::a),
               dfd.b.optionalFieldOf("air_state", a.b()).forGetter(dml::b),
               dfd.b.optionalFieldOf("water_state", a.b()).forGetter(dml::c),
               dfd.b.optionalFieldOf("lava_state", a.b()).forGetter(dml::d),
               dfd.b.optionalFieldOf("barrier_state", a.b()).forGetter(dml::e)
            )
            .apply($$0, dml::new)
   );
   private final boolean c;
   private final dfd d;
   private final dfd e;
   private final dfd f;
   private final dfd g;

   public static dml a(boolean $$0, dfd $$1, dfd $$2, dfd $$3, dfd $$4) {
      return new dml($$0, $$1, $$2, $$3, $$4);
   }

   public static dml a(dfd $$0, dfd $$1, dfd $$2, dfd $$3) {
      return new dml(false, $$0, $$1, $$2, $$3);
   }

   public static dml a(boolean $$0, dfd $$1) {
      return new dml($$0, $$1, a.c(), a.d(), a.e());
   }

   private dml(boolean $$0, dfd $$1, dfd $$2, dfd $$3, dfd $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dfd b() {
      return this.d;
   }

   public dfd c() {
      return this.e;
   }

   public dfd d() {
      return this.f;
   }

   public dfd e() {
      return this.g;
   }
}
